package prototype.classmatesNotebook;

public class Notebook implements CloneableInterface{
    private String size;
    private int pageCount;
    private String color ;
    private String quotes ;

    public Notebook(String size,int pageCount,String color ,String quotes) {
        this.size = size;
        this.pageCount = pageCount;
        this.color = color;
        this.quotes = quotes;
    }

    public Notebook(Notebook original){
        this.color = original.color;
        this.quotes = original.quotes;
        this.pageCount   = original.pageCount;
        this.size = original.size;
    }
    @Override
    public Notebook clone(){
        return new Notebook(this);
    }

}
