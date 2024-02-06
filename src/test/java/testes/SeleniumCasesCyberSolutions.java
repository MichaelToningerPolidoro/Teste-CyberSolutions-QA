package testes;

import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumCasesCyberSolutions {

	private WebDriver webDriver;
	
	@Before
	public void setUp() throws Exception {
		String wd = "webdriver.edge.driver";
		String wdPath = "E:\\webDrivers\\msedge\\msedgedriver.exe";
		System.setProperty(wd, wdPath);
		webDriver = new EdgeDriver();
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		webDriver.quit();
	}

	@Test
	public void cenario1() {
		/*
		 * Automatizar o formulário presente ao acessar o menu de navegação “Register”
		 *
		*/
		
		//Declaração dos caminhos para cada componente do formulário a ser utilizado.
		String xpathNome = "/html/body/section/div/div/div[2]/form/div[1]/div[1]/input";
		String xpathSobrenome = "/html/body/section/div/div/div[2]/form/div[1]/div[2]/input";
		String xpathEndereco = "/html/body/section/div/div/div[2]/form/div[2]/div/textarea";
		String xpathEmail = "/html/body/section/div/div/div[2]/form/div[3]/div[1]/input";
		String xpathTelefone = "/html/body/section/div/div/div[2]/form/div[4]/div/input";
		String xpathGeneroMasculino = "/html/body/section/div/div/div[2]/form/div[5]/div/label[1]/input";
		String xpathHobbieHockey = "/html/body/section/div/div/div[2]/form/div[6]/div/div[3]/input";
		String xpathPais = "/html/body/section/div/div/div[2]/form/div[9]/div/select";
		String xpathNascimentoAno = "/html/body/section/div/div/div[2]/form/div[11]/div[1]/select";
		String xpathNascimentoMes = "/html/body/section/div/div/div[2]/form/div[11]/div[2]/select";
		String xpathNascimentoDia = "/html/body/section/div/div/div[2]/form/div[11]/div[3]/select";
		String xpathSenha = "/html/body/section/div/div/div[2]/form/div[12]/div/input";
		String xpathConfirmacaoSenha = "/html/body/section/div/div/div[2]/form/div[13]/div/input";
		String xpathFormulario = "/html/body/section/div/div/div[2]/form";
		
		//Início da automação.
		webDriver.get("http://demo.automationtesting.in/Register.html");
		webDriver.findElement(By.xpath(xpathNome)).sendKeys("Michael");
		webDriver.findElement(By.xpath(xpathSobrenome)).sendKeys("Toninger Polidoro");
		webDriver.findElement(By.xpath(xpathEndereco)).sendKeys("AV. pres. Altino");
		webDriver.findElement(By.xpath(xpathEmail)).sendKeys("teste@gmail.com");
		webDriver.findElement(By.xpath(xpathTelefone)).sendKeys("0123456789");
		webDriver.findElement(By.xpath(xpathGeneroMasculino)).click();
		webDriver.findElement(By.xpath(xpathHobbieHockey)).click();
		new Select(webDriver.findElement(By.xpath(xpathPais))).selectByValue("Brazil");
		new Select(webDriver.findElement(By.xpath(xpathNascimentoDia))).selectByValue("8");
		new Select(webDriver.findElement(By.xpath(xpathNascimentoMes))).selectByValue("June");
		new Select(webDriver.findElement(By.xpath(xpathNascimentoAno))).selectByValue("2000");
		webDriver.findElement(By.xpath(xpathSenha)).sendKeys("AAaa123");
		webDriver.findElement(By.xpath(xpathConfirmacaoSenha)).sendKeys("AAaa123");
		
		//Envio do formulário
		webDriver.findElement(By.xpath(xpathFormulario)).submit();
	}
	
	@Test
	public void cenario2() {
		/*
		 * No menu de navegação “SwitchTo > Frames” você deve escrever dentro de um frame com 
		 * sua automação
		*/
		
		String xpathSwitchTo = "/html/body/header/nav/div/div[2]/ul/li[4]";
		
		webDriver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement switchTo = webDriver.findElement(By.xpath(xpathSwitchTo));
		List<WebElement> elementosA = switchTo.findElements(By.tagName("a"));
		
		for (WebElement a: elementosA) {
			if (a.getAttribute("href").endsWith("Frames.html")) {
				webDriver.get(a.getAttribute("href"));
			}
		}
		
		String xpathInput = "/html/body/section/div/div/div/input";
		
		webDriver.switchTo().frame("SingleFrame");
		webDriver.findElement(By.xpath(xpathInput)).sendKeys("Escrevendo algo dentro de um frame ...");
	}
	
	@Test
	public void cenario3() {
		/*
		 * No menu de navegação “Widgets > Datepicker” você deve inserir sua data de nascimento 
		 * nos dois campos
		*/
		String xpathDatePicker = "/html/body/section/div[1]/div/div/form/div[2]/div[3]/input";
		Calendar calendario = Calendar.getInstance(TimeZone.getDefault());
		int mes = calendario.get(Calendar.MONTH) + 1;
		int dia = calendario.get(Calendar.DATE);
		int ano = calendario.get(Calendar.YEAR);
		
		String dataAtual = mes + "/" + dia + "/" + ano;
		
		webDriver.get("http://demo.automationtesting.in/Datepicker.html");
		webDriver.findElement(By.xpath(xpathDatePicker)).sendKeys(dataAtual);
		webDriver.findElement(By.xpath(xpathDatePicker)).sendKeys(Keys.ENTER);
	}
	
	@Test
	public void cenario4() {
		/*
		 * No menu de navegação “Widgets > Slider” você deve fazer com que sua automação 
		 * movimente 50% da barra
		*/
		//style="left: 50%;"
		String xpathUISlider = "/html/body/section/div[1]/div/div/div/a";
		String xpathUISliderArea = "/html/body/section/div[1]/div/div/div";
		
		webDriver.get("http://demo.automationtesting.in/Slider.html");
		
		WebElement slider = webDriver.findElement(By.xpath(xpathUISlider));
		WebElement sliderArea = webDriver.findElement(By.xpath(xpathUISliderArea));
		Actions acoesSlider = new Actions(webDriver);
		
		acoesSlider.clickAndHold(slider)
			.moveToElement(slider, (sliderArea.getSize().width * 50 / 100), 0)
			.release()
			.perform();
	}
}
