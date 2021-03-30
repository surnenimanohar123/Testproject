import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.groupingBy;

public class ContractFilter {

    public static List<ContractData> getContractObjects(String data){
        String[] words=data.split("\\n");
        List<ContractData> contractData= new ArrayList<>();
        for(int z=0;z<words.length;z++){
            String[] objdata=words[z].split(",");
            contractData.add(new ContractData(Integer.valueOf(objdata[0]),Integer.valueOf(objdata[1]),objdata[2],objdata[3],objdata[4], Integer.valueOf(objdata[5].split("s")[0])));
        }
        return  contractData;
    }


    public static Map<Integer, Integer> contractdataWithUniqueCustomer(List<ContractData> contractData){
        Map<Integer, Integer> contractdatawithuniquecustomer= new HashMap<>();
        contractData.stream().collect(groupingBy(ContractData::getContractId,groupingBy(ContractData::getCustomerId))).forEach((k, v)->contractdatawithuniquecustomer.put(k,v.entrySet().size()));
        return  contractdatawithuniquecustomer;
    }

    public static Map<String, Integer> geodataWithUniqueCustomer(List<ContractData> contractData){
        Map<String, Integer> geoatawithuniquecustomer= new HashMap<>();
        contractData.stream().collect(groupingBy(ContractData::getGeozone,groupingBy(ContractData::getCustomerId))).forEach((k, v)->geoatawithuniquecustomer.put(k,v.entrySet().size()));
        return  geoatawithuniquecustomer;
    }

    public static Map<String, Double> geodataWithAvgCustomer(List<ContractData> contractData){
        Map<String, Double> geodatawithavercustomer= new HashMap<>();
        contractData.stream().collect(groupingBy(ContractData::getGeozone)).forEach((k, v)->geodatawithavercustomer.put(k,v.stream().collect(averagingInt(a->a.getBuildduration()))));
        return  geodatawithavercustomer;
    }


    public static Map<String, List<Integer>> geodataWithafterduplicateuniquecustomer(List<ContractData> contractData) {
        Map<String, List<Integer>> geodatawithuniqcustomer = new HashMap<>();
        contractData.stream().collect(groupingBy(ContractData::getGeozone)).forEach((k, v) -> geodatawithuniqcustomer.put(k, v.stream().map(contractData11 -> contractData11.getCustomerId()).distinct().collect(Collectors.toList())));
       return geodatawithuniqcustomer;

    }

}
