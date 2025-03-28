#include <stdio.h>
#include <string.h>

#define MAX_STACK_SIZE 10000

typedef struct {
    int stack[MAX_STACK_SIZE];
    int top;
}StackType;

void init_stack(StackType* s) {
    s->top = -1;
}

void push(StackType* s, int item) {
    s->stack[++(s->top)] = item;
    return;
}

int empty(StackType* s) {
    return (s->top == -1);
}

int pop(StackType* s) {
    if (empty(s)) {
        return -1;
    }
    return (s->stack[(s->top)--]);
}

int size(StackType* s) {
    return (s->top+1);
}

int top(StackType* s) {
    if (empty(s)) {
        return -1;
    }
    return (s->stack[s->top]);
}

int main() {
    StackType stack;
    init_stack(&stack);
    int num, val;
    scanf("%d", &num);

    char arr[num][10000]; 
    // 여기서 에러가 났다. 
    //처음에는 10을 주었는데 10보다 큰 값이 입력되면서 길이를 넘어간것 같고 
    //그래서 100000을 주었는데 메모리가 초과되었다.
    //앞으로는 제한 사항을 유심히 볼 필요가 있을 것 같다.

    for (int i = 0; i < num; i++) {
        scanf(" %[^\n]s", arr[i]);
    }
    
    for (int j = 0; j < num; j++) {
        if (strncmp(arr[j], "push", 4) == 0) {
            // "push" 명령 처리 
            //strncmp(str1, str2, n) str1과 str2를 최대 n개의 문자만 비교
            //0이면 일치
            sscanf(arr[j], "push %d", &val); 
            // "push 1"과 같은 형식을 처리, 숫자 추출
            push(&stack, val);
        } 
        else if (strcmp(arr[j], "pop") == 0) {
            printf("%d\n", pop(&stack));
        } 
        else if (strcmp(arr[j], "size") == 0) {
            printf("%d\n", size(&stack));
        } 
        else if (strcmp(arr[j], "empty") == 0) {
            printf("%d\n", empty(&stack));
        } 
        else if (strcmp(arr[j], "top") == 0) {
            printf("%d\n", top(&stack));
        }
    }

    return 0;
}
