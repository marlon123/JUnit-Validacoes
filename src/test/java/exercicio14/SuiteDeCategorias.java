package exercicio14;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import categorias.Positivos;

@RunWith(Categories.class)//indica que a suite vai executar focando em categorias
@IncludeCategory(Positivos.class)
@SuiteClasses(TesteCategorizado.class)
public class SuiteDeCategorias {
	
	

}
