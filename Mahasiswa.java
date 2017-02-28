#include <iostream.h>   //header untuk fungsi cin & cout//
#include <stdio.h>    //header untuk fungsi cin & cout//
#include <conio.h>    //header untuk fungsi cin & cout//
 void main()
{
 int a;      //deklarasi variabel//
 char b[20],c[50];   //deklarasi variabel//
  cout<<"==============LOG IN==============\n";
  cout<<"inputkan nama, NIM, dan Prodi anda\n";
  cout<<"NIM = ";
  cin>>a;     //memasukkan data NIM//
  cout<<"Nama = ";
  cin>>b;     //memasukkan data nama//
  cout<<"Prodi = ";
  cin>>c;     //memasukkan data prodi//
  cout<<"==================================\n";
  cout<<"==================================\n";
  cout<<"Data Anda:\n"; //menampilkan hasil data//
  cout<<"NIM = "<<a<<endl;
  cout<<"Nama = "<<b<<endl;
  cout<<"Prodi = "<<c<<endl;
 getche();
}