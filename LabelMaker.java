public class LabelMaker {
    private String sectionCode;
    private int maxNoOfChar;

    public LabelMaker(String n, int m){
        sectionCode = n; 
        maxNoOfChar = m;
    }

    public String getLabel(String itemName){
        if(sectionCode.equals(""){
            return itemName;
        }
        if(itemName.equals(""){
            return sectionCode;
        }

        return sectionCode + " " + itemName;
    }

    public String processLabel(String itemName){
        String fullLabel = getLabel(itemName);
        if(fullLabel.length() > maxNoOfChar){
            return fullLabel.substring(0,maxNoOfChar);
        }
        
        // return sectionCode + " " + itemName.substring(0, maxNoOfChar-1-sectionCode.length());
        return fullLabel;
    }
}
