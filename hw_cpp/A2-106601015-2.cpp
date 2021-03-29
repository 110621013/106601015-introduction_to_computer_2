using namespace std;
#include <stdio.h>
#include <string>
#include <iostream>
#include <vector>

class Book{
public:
    Book(string NAME, string iSBN, vector<string> CONTENT);
    string getName();
    string getISBN();
    string getContent(int PAGE);
    void addPage(string SENTENCE);
private:
    string Name;
    string ISBN;
    vector<string> Content;
};
Book::Book(string NAME, string iSBN, vector<string> CONTENT){
    Name = NAME;
    ISBN = iSBN;
    Content = CONTENT;
}
string Book::getName(){
    return Name;
}
string Book::getISBN(){
    return ISBN;
}
string Book::getContent(int PAGE){
    if(PAGE >= Content.size()){
        return "Error";
    }
    else{
        return Content[PAGE];
    }
}
void Book::addPage(string SENTENCE){
    Content.push_back(SENTENCE);
}

class BookShelf{
public:
    BookShelf();
    void addBook(Book MYBook);
    void showBookShelf();
private:
    vector<Book> Shelf;
};
BookShelf::BookShelf(){}
void BookShelf::addBook(Book MYBook){
    Shelf.push_back(MYBook);
}
void BookShelf::showBookShelf(){
    for(int i=0;i<Shelf.size();i++){
        cout << i << " " << Shelf[i].getName() << " " << Shelf[i].getISBN() << endl;
    }
}

int main()
{
    //Book1 information
    string N1 , iSBN1;
    vector<string> CONTENT1;
    N1="A";
    iSBN1="978-3-22-131238-2";
    CONTENT1.push_back("AAA");
    CONTENT1.push_back("BBB");
    CONTENT1.push_back("CCC");

    //Book2 information
    string N2 , iSBN2;
    vector<string> CONTENT2;
    N2="B";
    iSBN2="111-22-3-444444-5";
    CONTENT2.push_back("DDD");
    CONTENT2.push_back("EEE");

    //Book3 information
    string N3 , iSBN3;
    vector<string> CONTENT3;
    N3="C";
    iSBN3="666-66-6-666666-6";
    CONTENT3.push_back("FFF");
    CONTENT3.push_back("GGG");

    //Create class
    Book myBook1(N1,iSBN1,CONTENT1);
    Book myBook2(N2,iSBN2,CONTENT2);
    Book myBook3(N3,iSBN3,CONTENT3);

    //Testing
    cout<<myBook1.getName()<<" "<<myBook1.getISBN()<<endl;
    cout<<myBook2.getName()<<" "<<myBook2.getISBN()<<endl;
    cout<<myBook3.getName()<<" "<<myBook3.getISBN()<<endl;

    cout<<myBook3.getContent(0)<<" "<<myBook3.getContent(6)<<endl;
    myBook3.addPage("book3p4");
    myBook3.addPage("book3p5");
    myBook3.addPage("book3p6");

    for(int i=0;myBook3.getContent(i)!="Error";i++)
    {
        cout<<myBook3.getContent(i)<<endl;
    }

    BookShelf myBookShelf;
    myBookShelf.addBook(myBook1);
    myBookShelf.addBook(myBook3);
    myBookShelf.addBook(myBook2);
    myBookShelf.showBookShelf();

    return 0;
}

//gcc -o A2-106601015-1 A2-106601015-1.cpp