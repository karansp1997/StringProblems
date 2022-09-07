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

    public void replaceOccurrenceOfCharacterWithNumber(String givenString, char toFindOccurrence) {
        char[] breakGivenString = givenString.toCharArray();

        for(int i = 0; i<=breakGivenString.length-1; i++){
            if(givenString.indexOf(toFindOccurrence) == -1){
                System.out.println("Character to find occurrence of is not present in the given string: "+givenString);
                System.exit(0);
            }
        }

        int counter=0;

        for(int i = 0; i<=breakGivenString.length-1; i++) {
            if(breakGivenString[i] == toFindOccurrence){
                counter++;
                breakGivenString[i] = String.valueOf(counter).charAt(0);
            }
        }
        System.out.println(breakGivenString);
    }
}
