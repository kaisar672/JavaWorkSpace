package core_java_topics.inheritance.multiLevelInheritance;

public class Asset {
    private int asset_id;
    private String asset_type;

    public int getAsset_id() {
        return asset_id;
    }
    public void setAsset_id(int asset_id) {
        this.asset_id = asset_id;
    }
    public String getAsset_type() {
        return asset_type;
    }
    public void setAsset_type(String asset_type) {
        this.asset_type = asset_type;
    }
    public void displayAsset(){
        System.out.println("Asset Id = "+asset_id);
        System.out.println("Asset Type = "+asset_type);
    }
}
