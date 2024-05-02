package repository;

import model.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AnimalRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void inserirAnimal(Animal animal) {
        String sql = "INSERT INTO animal (NOME, IDADE_ANO, IDADE_MES, COR_PELO, PORTE_TAMANHO, PELAGEM, CASTRADO, DISPONIBILIDADE, RACA, SEXO, ID_ESPECIE  ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, animal.getNome(), animal.getIdadeAno(), animal.getIdadeMes(), animal.getCorPelo(), animal.getPorteTamanho(), animal.getPelagem(), animal.getCastrado(), animal.getDisponibilidade(), animal.getRaca(), animal.getDisponibilidade(), animal.getEspecie());
    }
}
