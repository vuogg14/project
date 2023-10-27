package frequency;

public class Paragraph {
    private String para;
    public Paragraph(){
        para="";
    }

    public Paragraph(String para) {
        para = para.toLowerCase();
        this.para = para;
    }

    public void setPara(String para){
        para = para.toLowerCase();
        this.para = para;
    }

    public String getPara(){
        return para;
    }

    public int getTotalWords(){
        int total = 0;
        for(int i=0; i<para.length(); i++){
            if(para.charAt(i)<='z' && para.charAt(i)>='a'){
                total++;
            }
        }
        return total;
    }

    public int[] calculateFrequency(){
        int[] frequency = new int[26];
        for(int i=0; i<para.length(); i++){
            if(para.charAt(i)<='z' && para.charAt(i)>='a'){
                frequency[para.charAt(i)-'a']++;
            }
        }
        return frequency;
    }
}
