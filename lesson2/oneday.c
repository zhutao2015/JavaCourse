#include <stdio.h>

#define BREAKFAST 0
#define LUNCH 1
#define SUPPER 2

void sleep(void){
    printf("Sleeping from 10pm to 7am\n");
}

void have_meal(int which){
    switch (which){
    case BREAKFAST:
        printf("Having breakfast at 8am\n");
        break;
    case LUNCH:
        printf("Having lunch at 1pm\n");
        break;
    case SUPPER:
        printf("Having supper at 7pm\n");
        break;
    default:
        printf("You eat too much!\n");
        break;
    }
}

void go_work(){
    printf("Going to work\n");
}

void code(void){
    printf("coding and coding ...\n");
}

void return_home(void){
    printf("returning home ...\n");
}

int main(){
    sleep();
    have_meal(BREAKFAST);
    go_work();
    code();
    have_meal(LUNCH);
    code();
    return_home();
    have_meal(SUPPER);
    return 0;
}
