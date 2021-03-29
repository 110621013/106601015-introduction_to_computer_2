#include <iostream>

using namespace std;

class Square{
public:
    Square(int r);
    float getArea();
private:
    float area;
};
Square::Square(int r){
    area = r*r;
}
float Square::getArea(){
    return area;
}

class Circle{
public:
    Circle(int r);
    static float circleArea(int r);
    void compareArea(Square s);
    float getArea();
private:
    static const  int pi = 3;
    float area;
};
Circle::Circle(int r){
    area = r*r*pi;
}
float Circle::circleArea(int r){
    return r*r*pi;
}
void Circle::compareArea(Square s){
    if(area > s.getArea()){
        cout << "Circle one is the biggest" << endl;
    }
    else{
        cout << "Square one is the biggest" << endl;
    }
}
float Circle::getArea(){
    return area;
}

class Area{
public:
    static void compare(Circle c, Square s);
};
void Area::compare(Circle c, Square s){
    if(c.getArea() > s.getArea()){
        cout << "Circle one is the biggest" << endl;
    }
    else{
        cout << "Square one is the biggest" << endl;
    }
}

int main(){
    int r;
    cin >> r;
    cout << "Circle Area:" << Circle::circleArea(r) << endl;

    //new�@�ӥb�|��10��Circle Class
    Circle r1(10);
    //new�@�ӥb�|��3��Circle Class
    Circle r2(3);
    //new�@�������3��Square Class
    Square s1(3);
    //new�@�������10��Square Class
    Square s2(10);
    //r1�Ms1������n
    r1.compareArea(s1);
    //r2�Ms2������n
    Area::compare(r2,s2);
    return 0;
}

//g++ -o A4 A4.cpp