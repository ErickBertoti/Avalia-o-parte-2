package Repository;

public interface Repository extends  <Fornecedor, String>{
    List<Pokemon> findByTypeAndRegion(String type, String region);
}