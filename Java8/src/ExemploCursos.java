import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Curso {
	private String nome;
	private int alunos;

	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public int getAlunos() {
		return alunos;
	}
}

public class ExemploCursos {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		cursos.sort(Comparator.comparing(Curso::getAlunos));

		cursos.forEach(System.out::println);

		System.out.println("-------");

		cursos.forEach(c -> System.out.println(c.getNome()));

		System.out.println("-------");

		cursos.stream().filter(c -> c.getAlunos() >= 100);
		cursos.forEach(c -> System.out.println(c.getNome()));
		//stream n impacta a colecao original

		System.out.println("-------");

		cursos.stream().filter(c -> c.getAlunos() >= 100)
		.forEach(c -> System.out.println(c.getNome()));
		
		System.out.println("-------");
		
		cursos.stream().filter(c -> c.getAlunos() >= 100)
		.map(Curso::getAlunos)
		.forEach(System.out::println);
		
		System.out.println("-------");
		
		int sum = cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.mapToInt(Curso::getAlunos)
		.sum();
		
		System.out.println(sum);
		
		System.out.println("-------");
		
		cursos.stream().filter(c -> c.getAlunos() >= 100)
		.findAny()
		.ifPresent(c -> System.out.println(c.getNome()));
		
		System.out.println("-------");
		
		cursos = cursos.stream().filter(c -> c.getAlunos() >= 100)
		.collect(Collectors.toList());
		
		cursos.stream().forEach(c -> System.out.println(c.getNome()));
		
		System.out.println("-------");
		
		Map<String, Integer> map = cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.collect(Collectors.toMap(
				c -> c.getNome(),
				c -> c.getAlunos()));
		
		System.out.println(map);
		
		System.out.println("-------");
		
		cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.collect(Collectors.toMap(
				c -> c.getNome(),
				c -> c.getAlunos()))
		.forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos."));
		
		System.out.println("-------");
		
		cursos.parallelStream()
		.filter(c -> c.getAlunos() >= 100)
		.collect(Collectors.toMap(
				c -> c.getNome(),
				c -> c.getAlunos()))
		.forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos."));
		}
}