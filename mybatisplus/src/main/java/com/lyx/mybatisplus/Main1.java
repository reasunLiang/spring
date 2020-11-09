package com.lyx.mybatisplus;

// 本题为考试单行多行输入输出规范示例，无需提交，不计分。

import java.util.Scanner;

/**
 * @author lyx
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //查询方式
        int f;
        f = in.nextInt();
        int count = in.nextInt();
        String[] Strings = new String[count];
        in.nextLine();
        for (int i = 0; i < count; i++) {
            Strings[i] = in.nextLine();
        }

        String flag = in.nextLine();
        if (f == 1) {
            Search1(Strings, flag);
        } else {
            Search2(Strings, flag);
        }
    }

    /**
     * 查询找所有和指点线段又重叠的线段列表
     *
     * @param strings
     */
    private static void Search2(String[] strings, String flag) {
        String[] split = flag.split("，");
        for (int i = 0; i < strings.length; i++) {

            String[] split1 = strings[i].split(",");
            if (Integer.parseInt(split[1]) <= Integer.parseInt(split1[0]) ||
                    Integer.parseInt(split[0]) >= Integer.parseInt(split1[1])
            ) {
            } else {
                System.out.println(strings[i]);
            }
        }

    }

    /**
     * 查询找包含在指定区间内的线段列表
     *
     * @param strings
     */
    private static void Search1(String[] strings, String flag) {
        String[] split = flag.split(",");

        for (int i = 0; i < strings.length; i++) {
            String[] split1 = strings[i].split(",");
            if (Integer.parseInt(split[0]) <= Integer.parseInt(split1[0])
                    && Integer.parseInt(split[1]) >= Integer.parseInt(split1[1])) {
                System.out.println(strings[i]);
            }
        }
    }
}