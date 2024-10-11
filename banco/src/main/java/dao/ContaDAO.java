package dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entidade.Conta;

public class ContaDAO {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setCpfCorrentista("04425225112");
		conta.setDataTransacao(new Date());
		conta.setDescricao("Depósito de 500,00 no dia 03/10/24");
		conta.setNomeCorrentista("José");
		conta.setTipoTransacao("depósito");
		conta.setValorOperacao(500.);
		
		new ContaDAO().inserir(conta);
		
	}

	EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory("bancoPU");
	
	public Conta inserir(Conta conta) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(conta);
		em.getTransaction().commit();
		em.close();
		return null;
	}
	
	public Conta alterar(Conta conta) {
		Conta contaBanco = null;
		if(conta.getId()!=null) {
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			
			contaBanco = buscarPorId(conta.getId());
			if(contaBanco!=null) {
				
				contaBanco.setDescricao(conta.getDescricao());
				em.merge(contaBanco);
			}

		
		em.getTransaction().commit();
		em.close();
		}
		return conta;
	}
	
	public void excluir(Long id) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Conta conta = em.find(Conta.class, id);
		if(conta!=null) {
			em.remove(conta);
		}
		em.getTransaction().commit();
		em.close();
	}
	
	public List<Conta> listarTodos(){
		return null;
	}
	
	
	public Conta buscarPorId(Long id) {
		EntityManager em = emf.createEntityManager();
		Conta conta = em.find(Conta.class, id);
		em.close();
		return conta;
		
		
		
	}
}
