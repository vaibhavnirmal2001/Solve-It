#include<bits/stdc++.h>
using namespace std;
int main()
{
//     string s="Rjbu-rJhIryk-QATuUF-OyyjOoUAq-YNhbS";
     sting s="oihA-uMakHig-jjfSxU-jDxUPHCgq-CZNNx"
//     cout<<"enter the string "<<endl;
//     cin>>s;

     transform(s.begin(), s.end(), s.begin(), ::tolower);
     vector<string>v;
     string temp="";
     for(int i=0;i<s.size();i++)
     {
        if(s[i]=='-')
        {
            v.push_back(temp);
            temp="";
        }
        else
            temp.push_back(s[i]);

     }
     for(int i=0;i<v.size();i++)
     {
           cout<<v[i]<<" ";
     }
}