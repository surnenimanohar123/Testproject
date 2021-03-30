import java.util.List;

public class Sample {


    public static void main(String[] args) {
        String data="2343225,2345,us_east,RedTeam,ProjectApple,3445s\n" +
                "1223456,2345,us_west,BlueTeam,ProjectBanana,2211s\n" +
                "3244332,2346,eu_west,YellowTeam3,ProjectCarrot,4322s\n" +
                "1223456,2345,us_west,BlueTeam,ProjectDate,2221s\n" +
                "3244132,2346,eu_west,YellowTeam3,ProjectEgg,4122s";


            List<ContractData> contractData= ContractFilter.getContractObjects(data);
            System.out.println(ContractFilter.contractdataWithUniqueCustomer(contractData));
        System.out.println(ContractFilter.geodataWithafterduplicateuniquecustomer(contractData));
        System.out.println(ContractFilter.geodataWithAvgCustomer(contractData));

        System.out.println(ContractFilter.geodataWithUniqueCustomer(contractData));

    }
}
