package kleberlz.convidados;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor  // Assim que o framework cria a entidade no banco de dados.
public class Convidado {
	@Column
    private String nome;
	
    @Id
    @Column
    private String cpf;
    
}
