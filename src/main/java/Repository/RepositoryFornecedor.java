package ;Repository

public interface Repository extends Fornecedor <, String>{
    List<Fornecedor> findByName(String nome);
    List<Fornecedor> findByEmail(String email);
    List<Fornecedor> findByTelefone(String telefone);
    
} 