public class SetOfCharacters8 {
    public static void main(String[] args) {
        String s1 = "amar";
        String s2 = "rama";
        SetOfCharacters8 obj = new SetOfCharacters8();
        if(obj.checkStrings(s1,s2)){
            System.out.println("Both contains same characters");
        }
        else {
            System.out.println("Both contains different characters");
        }



    }

    public boolean checkStrings(String s1, String s2) {
        boolean response = true;
        if(s1.length() == s2.length()){
            for (int i = 0; i < s2.length() ; i++) {
                if(s1.contains(""+ s2.charAt(i))){
                   continue;
                }
                else{
                    response = false;
                    break;
                }
            }

        }
        else{
            response = false;
        }

        return response;
    }
}

