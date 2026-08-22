package com.java.program.string.august_26;

public class DuplicateRemoves {
    public static void main(String[] args) {
        String str= "Anand Kumar";
        str= str.toLowerCase();
        char[] string = str.toCharArray();

        for (int i=0;i<string.length;i++){
            for (int j=i+1; j<string.length;j++){
                if (string[i]==string[j] && string[i]!=' '){
                    string[j]='0';
                }
            }
        }
        for (int i=0;i<string.length;i++){
            if (string[i]!='0'){
                System.out.println(string[i]);
            }
        }

        System.out.println("another way");
        boolean[] visited = new boolean[str.length()];
        for (int i=0;i<string.length-1;i++){
            if (string[i]==string[i+1] & string[i]!=' '){
                visited[i] = true;
                visited[i+1] = true;
            }
        }
        for (int i=0;i<string.length;i++){
            if(!visited[i] && string[i]!='0'){
                System.out.println(string[i]);
            }
        }
    }
}
