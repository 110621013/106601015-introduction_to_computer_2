using namespace std;
#include <stdio.h>
#include <string>
#include <iostream>
#include <iomanip>
#include <vector>

class StudentInfo{
public:
    StudentInfo(string Id, string Name, int ChineseScore, int MathScore, int ScienceScore, int EnglishScore);
    string getId();
    string getName();
    int getChineseScore();
    int getMathScore();
    int getScienceScore();
    int getEnglishScore();
    float getAverage();

    void renewChineseScore(int NewScore);
    void renewMathScore(int NewScore);
    void renewScienceScore(int NewScore);
    void renewEnglishScore(int NewScore);

    void calculateAverage();
    void printSingleInfo();
private: //hw ask
    string Id;
    string Name;
    int ChineseScore;
    int MathScore;
    int ScienceScore;
    int EnglishScore;
    float Average;
};
StudentInfo::StudentInfo(string Id_in, string Name_in, int ChineseScore_in, int MathScore_in, int ScienceScore_in, int EnglishScore_in){
    Id = Id_in;
    Name = Name_in;
    ChineseScore = ChineseScore_in;
    MathScore = MathScore_in;
    ScienceScore = ScienceScore_in;
    EnglishScore = EnglishScore_in;
    calculateAverage(); //isn't necessary actually
}
string StudentInfo::getId(){
    return Id;
}
string StudentInfo::getName(){
    return Name;
}
int StudentInfo::getChineseScore(){
    return ChineseScore;
}
int StudentInfo::getMathScore(){
    return MathScore;
}
int StudentInfo::getScienceScore(){
    return ScienceScore;
}
int StudentInfo::getEnglishScore(){
    return EnglishScore;
}
float StudentInfo::getAverage(){
    return Average;
}

void StudentInfo::renewChineseScore(int NewScore){
    ChineseScore = NewScore;
}
void StudentInfo::renewMathScore(int NewScore){
    MathScore = NewScore;
}
void StudentInfo::renewScienceScore(int NewScore){
    ScienceScore = NewScore;
}
void StudentInfo::renewEnglishScore(int NewScore){
    EnglishScore = NewScore;
}

void StudentInfo::calculateAverage(){
    float c = ChineseScore;
    float m = MathScore;
    float s = ScienceScore;
    float e = EnglishScore;
    Average = (c+m+s+e)/4;
}
void StudentInfo::printSingleInfo(){
    calculateAverage();
    cout<<getName()<<" "<<getId()<<" "<<getChineseScore()<<" "<<getMathScore()<<" "<<getScienceScore()<<" "<<getEnglishScore()<<" "<<setprecision(2)<<fixed<<getAverage()<<endl;
}


class InfoSystem{
public:
    InfoSystem();
    void sortedAddInfo(StudentInfo NewInfo);
    void modifyBook(string id, int subject, int score);
    void printAllInfo();
    void deleteBook(string id);
private:
    vector<StudentInfo> StudentInfoList;
};
InfoSystem::InfoSystem(){}
void InfoSystem::sortedAddInfo(StudentInfo NewInfo){
    bool inserted_flag = false;
    for(int i=0; i<StudentInfoList.size(); i++){
        if(StudentInfoList[i].getId() == NewInfo.getId()){
            cout<<"---> Id repeat!"<<endl;
            break;
        }
        else if(StudentInfoList[i].getId().size() > NewInfo.getId().size() || StudentInfoList[i].getId() > NewInfo.getId()){
            StudentInfoList.insert(StudentInfoList.begin()+i, NewInfo);
            inserted_flag = true;
            break;
        }
    }
    if(!inserted_flag){
        StudentInfoList.push_back(NewInfo);
    }
}
void InfoSystem::modifyBook(string id, int subject, int score){
    for(int i=0; i<StudentInfoList.size(); i++){
        if(StudentInfoList[i].getId() == id){
            if(subject == 1){
                StudentInfoList[i].renewChineseScore(score);
            }
            else if(subject == 2){
                StudentInfoList[i].renewMathScore(score);
            }
            else if(subject == 3){
                StudentInfoList[i].renewScienceScore(score);
            }
            else if(subject == 4){
                StudentInfoList[i].renewEnglishScore(score);
            }
            else{
                cout<<"---> modify id notfound!"<<endl;
            }
        }
    }
}
void InfoSystem::printAllInfo(){
    for(int i=0; i<StudentInfoList.size(); i++){
        StudentInfoList[i].printSingleInfo();
    }
}
void InfoSystem::deleteBook(string id){
    for(int i=0; i<StudentInfoList.size(); i++){
        if(StudentInfoList[i].getId() == id){
            StudentInfoList.erase(StudentInfoList.begin()+i);
        }
    }
}


int main(){
    int button, ChineseScore, MathScore, ScienceScore, EnglishScore, subject, score;
    string id, name;
    InfoSystem InfoSystemTest;
    while(true){
        cout<<"(1) Insert (2) Change score (3) Print all (4) Delete (5) Exit"<<endl;
        cin>>button;

        if(button == 1){
            cout<<"Please enter student id/name/scores(Chinese/Math/Science/English)"<<endl;
            cin>>id>>name>>ChineseScore>>MathScore>>ScienceScore>>EnglishScore;
            StudentInfo info(id, name, ChineseScore, MathScore, ScienceScore, EnglishScore);
            InfoSystemTest.sortedAddInfo(info);
        }
        else if(button == 2){
            cout<<"Please enter student id"<<endl;
            cin>>id;
            cout<<"Which subject? (1) Chinese (2) Math (3) Science (4) English"<<endl;
            cin>>subject;
            cout<<"Please enter new score"<<endl;
            cin>>score;
            InfoSystemTest.modifyBook(id, subject, score);
        }
        else if(button == 3){
            InfoSystemTest.printAllInfo();
        }
        else if(button == 4){
            cout<<"Please enter student id"<<endl;
            cin>>id;
            InfoSystemTest.deleteBook(id);
        }
        else if(button == 5){
            break;
        }
        else{
            cout << "wtf you insert??" << endl;
        }
    }
    system("pause");
}

//g++ -o A3-106601015 A3-106601015.cpp