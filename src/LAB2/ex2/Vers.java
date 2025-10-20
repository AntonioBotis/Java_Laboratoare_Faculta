package LAB2.ex2;

public class Vers {
    public  String Verse;

    public int Words(String a)
    {
        String[] words = a.split(" ");
        return words.length;
    }
    public int Vocals(String a)
    {
        String vocals="aeiouAEIOU";
        int nr=0;
        for(int i=0;i<a.length();i++)
        {
            int index=vocals.indexOf(a.charAt(i));
            if (index >= 0)
                nr++;


        }
        return nr;
    }
}
