public class StringProblems {

    public void reverseAString(String reverseArgument) {
        String reverseString="";
        for(int i = reverseArgument.length()-1; i>=0; i--) {
            reverseString = reverseString + reverseArgument.charAt(i);
        }
        System.out.println(reverseString);
    }

    public void removeWhiteSpaces(String whiteSpacedString) {
        System.out.println(whiteSpacedString.replaceAll("\\s", ""));
    }

    public void removeDuplicateCharacters(String stringWithDuplicates) {
        String nonRepeating = "";
        for(int i = 0; i<=stringWithDuplicates.length()-1; i++){
            boolean isRepeated = false;
            for(int j = i+1; j<=stringWithDuplicates.length()-1; j++){
                if(stringWithDuplicates.charAt(i) == stringWithDuplicates.charAt(j)){
                    isRepeated = true;
                    break;
                }
            }
            if(!isRepeated){
                nonRepeating = nonRepeating+stringWithDuplicates.charAt(i);
            }
        }
        System.out.println(nonRepeating);
    }

    public void sortString(String stringToBeSorted) {
        char[] toBeSorted = stringToBeSorted.toCharArray();
        char temp;
        for(int i = 0; i<=stringToBeSorted.length()-1; i++) {
            for(int j = i+1; j<=stringToBeSorted.length()-1; j++) {
                if(toBeSorted[i]>toBeSorted[j]){
                    temp=toBeSorted[i];
                    toBeSorted[i] = toBeSorted[j];
                    toBeSorted[j] = temp;
                }
            }
        }
        System.out.println(new String(toBeSorted));
    }
}
