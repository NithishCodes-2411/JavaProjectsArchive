import java.util.HashSet;

public class xyx {

    HashSet <String> n = new HashSet<>(100,95);
}



/*
        +-------------+       +----------------+       +-----------------+
        |   WebStore  |       |   Warehouses   |       |    Accounting   |
        +-------------+        +----------------+       +-----------------+
        |  Search     |            |   Inventory    |       |    Financial    |
        |  Shopping   |  <----->|   Order        |<----->|    Reports      |
        |  Authentication |   |   Shipping     |       |                 |
        |  Manage Order    |   |                |       |                 |
        |  Manage Customers|   |                |       |                 |
        +-------------+       +----------------+       +-----------------+


#include <iostream>
#include <string>
using namespace std;

template <class T>
class myFirstclass {
public:
    T num1, num2;

    myFirstclass(T n1, T n2) {
        num1 = n1;
        num2 = n2;
    }
};

template <class T>
T findMin(T a, T b) {
    return (a < b) ? a : b;
}

template <class T>
T findMax(T a, T b) {
    return (a > b) ? a : b;
}

int main() {

    myFirstclass<int> intObj(4, 7);
    cout << "Integer Example:" << endl;
    cout << "Num1 = " << intObj.num1 << ", Num2 = " << intObj.num2 << endl;
    cout << "Minimum = " << findMin(intObj.num1, intObj.num2) << endl;
    cout << "Maximum = " << findMax(intObj.num1, intObj.num2) << endl;

    myFirstclass<float> floatObj(3.14, 2.72);
    cout << "\nFloat Example:" << endl;
    cout << "Num1 = " << floatObj.num1 << ", Num2 = " << floatObj.num2 << endl;
    cout << "Minimum = " << findMin(floatObj.num1, floatObj.num2) << endl;
    cout << "Maximum = " << findMax(floatObj.num1, floatObj.num2) << endl;


    myFirstclass<double> doubleObj(2.718, 3.141);
    cout << "\nDouble Example:" << endl;
    cout << "Num1 = " << doubleObj.num1 << ", Num2 = " << doubleObj.num2 << endl;
    cout << "Minimum = " << findMin(doubleObj.num1, doubleObj.num2) << endl;
    cout << "Maximum = " << findMax(doubleObj.num1, doubleObj.num2) << endl;

    myFirstclass<string> stringObj("apple", "orange");
    cout << "\nString Example:" << endl;
