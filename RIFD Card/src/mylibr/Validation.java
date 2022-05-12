package mylibr;

import java.util.Scanner;

public class Validation {
    public static int inputNumber(String lon_be_condtion, String num_condition, String msg) throws Exception {

        int lon_be = -100;
        Scanner sn = new Scanner(System.in);
        System.out.print(msg);
        String num = sn.nextLine();
        if (num.isEmpty() || num.equals("\\D{0,}")) {
            throw new Exception();
        } else {
            int number = Integer.parseInt(num);
            if (lon_be_condtion.equals("lon_hon_hoac_bang")) {
                lon_be = 1;
            }
            if (lon_be_condtion.equals("be_hon_hoac_bang")) {
                lon_be = -1;
            }
            if (lon_be_condtion.equals("ko_dc_bang")) {
                lon_be = 0;
            }
            if (num_condition != null) {
                int num_condition_2 = Integer.parseInt(num_condition);
                if (lon_be == 1) {
                    if (number < num_condition_2) {
                        throw new Exception();
                    }
                } else if (lon_be == -1) {
                    if (number > num_condition_2) {
                        throw new Exception();
                    }
                } else if (lon_be == 0) {
                    if (number == num_condition_2) {
                        throw new Exception();
                    }
                }
            }
            return number;
        }
    }

    public static String inputString(String str_match, String msg) throws Exception {
        Scanner sn = new Scanner(System.in);
        System.out.print(msg);
        String string_input = sn.nextLine();

        if (string_input.isEmpty()) {
            throw new Exception();
        }

        if (str_match != null) {
            if (string_input.matches(str_match) == false) {
                throw new Exception();
            }
        }

        return string_input;

    }

    public static boolean inputBoolean(String msg) throws Exception{
        boolean answer = false;
        Scanner sn=new Scanner(System.in);
        System.out.print(msg);
        String string_input = sn.nextLine();
        if(string_input.matches("y") || string_input.matches("n")){
            if (string_input.matches("y")) answer = true;
            if (string_input.matches("n")) answer = false;
        }else throw new Exception();

        return answer;
    }
}
