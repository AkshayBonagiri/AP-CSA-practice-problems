public class EmailGenerator {
    private String prefix;
    private String domain;
    private int counter = 2;
    private boolean firstGeneration = true;

    public EmailGenerator(String u, String d){
        prefix = u;
        domain = d;
    }

    public String generateAddress(){
        String result = "";
        if(firstGeneration){
            firstGeneration = false;
            result = prefix + "@" + domain;
        }
        else{
            result = prefix + counter + "@" + domain;
            counter++;
        }
        return result;
    }

    public void changePrefix(String newPrefix){
        firstGeneration = true;
        counter = 2;
        prefix = newPrefix;
    }
}
