public class WordProblem {
    public static void main(String[] args) {
        int sum=0;
        String Word="Word";
        String WordL=Word.toLowerCase();
        for (int i=0;i<WordL.length();i++){
          switch (WordL.charAt(i)) {
            case 'a':
                sum+=1;
                break;
            case 'b':
            sum+=3;
            break;

            case 'c':
            sum+=3;
            break;

            case 'd':
            sum+=2;
            break;

            case 'e':
            sum+=1;
            break;

            case 'f':
            sum+=4;
            break;

            case 'g':
            sum+=2;
            break;

            case 'h':
            sum+=4;
            break;

            case 'i':
            sum+=1;
            break;

            case 'j':
            sum+=8;
            break;

            case 'k':
            sum+=5;
            break;

            case 'l':
            sum+=1;
            break;

            case 'm':
            sum+=3;
            break;

            case 'n':
            sum+=1;
            break;


            case 'o':
            sum+=1;
            break;


            case 'p':
            sum+=3;
            break;


            case 'q':
            sum+=10;
            break;


            case 'r':
            sum+=1;
            break;


            case 's':
            sum+=1;
            break;


            case 't':
            sum+=1;
            break;

            case 'u':
            sum+=1;
            break;

            case 'v':
            sum+=4;
            break;


            case 'w':
            sum+=4;
            break;


            case 'x':
            sum+=8;
            break;


            case 'y':
            sum+=4;
            break;


            case 'z':
            sum+=10;
            break;


            
          
            default:
                break;
          }
        }
        System.err.println(sum);
    }
    

}