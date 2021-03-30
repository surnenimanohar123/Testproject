public class ContractData {


   private Integer customerId;
    private Integer contractId;
    private String geozone;
    private String teamcode;
    private String projectcode;
    private Integer buildduration;

    public ContractData(Integer customerId,Integer contractId, String geozone,String teamcode,String projectcode, Integer buildduration) {
        this.customerId=customerId;
        this.contractId = contractId;
        this.geozone = geozone;
        this.teamcode=teamcode;
        this.projectcode=projectcode;
        this.buildduration = buildduration;
    }
    public ContractData(){

    }



    public Integer getCustomerId(){
        return this.customerId;
    }

    public Integer getContractId(){
        return this.contractId;
    }


    public String getGeozone(){
        return this.geozone;
    }
    public String getTeamcode(){
        return this.teamcode;
    }
    public String getProjectcode(){
        return this.projectcode;
    }

    public Integer getBuildduration(){
        return this.buildduration;
    }

    public String toString(){
        return "contid:"+this.contractId+" custome:"+this.customerId+"pc:"+this.projectcode+" build:"+this.buildduration;
    }

}
