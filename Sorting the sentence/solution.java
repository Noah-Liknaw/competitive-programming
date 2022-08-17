class Solution {
    public String sortSentence(String s) {
        String[] words = s.split( );
        int wordIndex[] = new int[words.length];
        String result=;
         put last character of each word into an array
        for(int i=0;i words.length;i++){
           wordIndex[i]=Integer.parseInt(String.valueOf(words[i].charAt(words[i].length()-1)));
        }

        Sorted the array using insertion sort
        for (int j = 1; j  words.length; j++) {
            int key = wordIndex[j];
            String temp = words[j];
            int i = j-1;
            while ( (i  -1) && ( wordIndex [i]  key ) ) {
                wordIndex [i+1] = wordIndex [i];
                words[i+1] = +words[i];
                i--;
            }
            wordIndex[i+1] = key;
            words[i+1] = temp;
        }

         remove last character from each word
        for(int i=0;iwords.length;i++){
            words[i] = words[i].substring(0,words[i].length()-1);
        }


         display sorted array
        result=words[0];
        for(int i=1;i words.length;i++){
            result+= +words[i];
        }
        return result;
    }
}