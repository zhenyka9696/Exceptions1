package com.company;

public class UserExeptions {
    public static void main(String[] args) throws NotEvenException, NotInRange {
     //Проверка на чётность
    int n=2;
    if(n%2!=0)
        throw new NotEvenException("The number is not even");
    //Проверка нахождения числа в диапазоне 1..10
    n=0;
    if (n<1||n>10) throw new NotInRange( "The number is not in range");
    }
}

class NotEvenException extends Exception {
    NotEvenException(String s){
          super(s);

    }
}
class NotInRange extends Exception{
    NotInRange(String s){super(s);}
}
