public int AddSub(int input1, int input2){

    int num = 0;

    if(input2 == 1){

        while(input1 > 0){

            if(input1 - 1 >= 1){
                num = num + input1 - (input1 - 1);
                input1 = input1 - 2;
            }
            else{
                num = num + input1;
                input1--;
            }
        }
    }
    else{

        while(input1 > 0){

            if(input1 - 1 >= 1){
                num = num + input1 + (input1 - 1);
                input1 = input1 - 2;
            }
            else{
                num = num + input1;
                input1--;
            }
        }
    }

    return num;
}
