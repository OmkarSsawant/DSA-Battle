#include<stdio.h>



int main(){

    int a[4][4];
    //[
    // 0 0 0 0   
    // 0 0 0 0
    // 0 0 0 0
    // 0 0 0 0  
    //]
    int size_r = sizeof(a) / sizeof(a[0]);
    int size_c = sizeof(a[0]) / sizeof(a[0][0]);
    printf("Hello world  %d [%d X %d]\n",a[0][0],size_r,size_c); //not neccessary will be init to 0

    for(int i=0;i<size_r;i++){
        for(int j=0;j<size_c;j++){
            printf("| %d |",a[i][j]);
        }
        printf("\n");
    }
    

}