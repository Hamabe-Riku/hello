import java.io.*;

class Kazuate{
    public static void main(String[] args){
        int setting = 77;
        int i = 1;
        int flag = 0;
        int diff = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("数当てゲームです.私が設定した数を当ててください.(チャンスは5回)");
        while(i<=5 && flag == 0){
            System.out.printf("数字を入力してください.(残り%d回)\n",6-i);
            try{
                String x = br.readLine();
                int num = Integer.parseInt(x);
                if(num == setting){
                    System.out.println("当たり");
                    flag = 1;
                }
                else{
                    if(num > setting){
                        diff = num - setting;
                        if(diff>=20){
                            System.out.println("あなたの数字は正解より20以上大きいです.");
                        }
                        else{
                            System.out.println("あなたの数字は正解より大きいです.");
                        }
                    }
                    else{
                        diff = setting - num;
                        if(diff>=20){
                            System.out.println("あなたの数字は正解より20以上小さいです.");
                        }
                        else{
                            System.out.println("あなたの数字は正解より小さいです.");
                        }
                    }
                    if(i == 5 && flag == 0){
                        System.out.printf("残念、正解は%dです.\n",setting);
                    }
                    i++;
                }
            }catch(IOException e){
                System.out.println(e.getMessage());
            }
        }

    }
}