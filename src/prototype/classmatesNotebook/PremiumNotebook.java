package prototype.classmatesNotebook;

public class PremiumNotebook extends Notebook{
    private String coverDesignType;
    private String pageType;
    public PremiumNotebook(String size,int pageCount ,String color,String quotes ,String coverDesignType ,String pageType){
        super(size,pageCount,color,quotes);

        this.coverDesignType = coverDesignType;
        this.pageType = pageType;
    }

    public PremiumNotebook(PremiumNotebook original){
        super(original);
        this.pageType = original.pageType;
        this.coverDesignType = original.coverDesignType;
    }

    @Override
    public PremiumNotebook clone(){
        return new PremiumNotebook(this);
    }
}
