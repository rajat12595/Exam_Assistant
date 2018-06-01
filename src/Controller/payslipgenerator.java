package Controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * Servlet implementation class payslipgenerator
 */
@WebServlet("/payslipgenerator")
public class payslipgenerator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	private static String FILE = "formatedPositionPdf1.pdf";

	private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,
			Font.BOLD);

	private static Font catFont1 = new Font(Font.FontFamily.TIMES_ROMAN, 18,
			Font.UNDERLINE);

	private static Font subcatFont = new Font(Font.FontFamily.TIMES_ROMAN, 14,
			Font.BOLD);

	private static Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
			Font.NORMAL, BaseColor.RED);
	private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
			Font.BOLD);
	private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,
			Font.BOLD);


    public payslipgenerator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
			   String filePath = getServletContext().getRealPath(request.getServletPath());
			   int path = filePath.lastIndexOf('\\');
			   String path1= filePath.substring(0, path) +"\\doc\\";
			   
			 
			HttpSession session = request.getSession();
		   //	Long s = (Long)session.getAttribute("userId");
			//Long userid =(Long) session.getAttribute("userId");
			
		

			
			Document document = new Document();

			ByteArrayOutputStream ba = new ByteArrayOutputStream (); 
			PdfWriter writer = PdfWriter.getInstance (document, ba); 

			//PdfWriter.getInstance(document, new FileOutputStream(path1+"/"+FILE));
			document.open();
			
			// Left
			
			Paragraph paragraph = new Paragraph("GTU", catFont);
			paragraph.setAlignment(Element.ALIGN_CENTER);

			// paragraph.setAlignment(Element.ALIGN_RIGHT);
			document.add(paragraph);
			// Centered

			
			paragraph = new Paragraph("Ahmedabad", subcatFont);
			paragraph.setAlignment(Element.ALIGN_CENTER);
			addEmptyLine(paragraph, 2);
			
			document.add(paragraph);
			
			paragraph = new Paragraph("External Examiner's Feedback Form", catFont1);
			addEmptyLine(paragraph, 3);
			paragraph.setAlignment(Element.ALIGN_CENTER);
			document.add(paragraph);
			
			
			paragraph = new Paragraph("1  Name & Address of External Examiner (With parent Institute Code)		:________________________", subFont);
			paragraph.setAlignment(Element.ALIGN_LEFT);
			document.add(paragraph);
			
			paragraph = new Paragraph("2  Name of Internal Examiner (With Examcentre Code)			:_________________________", subFont);
			paragraph.setAlignment(Element.ALIGN_LEFT);
			document.add(paragraph);
			
			paragraph = new Paragraph("3  Name of Subject (With Subject Code)				:_________________________", subFont);
			paragraph.setAlignment(Element.ALIGN_LEFT);
			document.add(paragraph);
			
			paragraph = new Paragraph("4  Date of Examination			:_________________________", subFont);
			paragraph.setAlignment(Element.ALIGN_LEFT);
			document.add(paragraph);
			
			
			paragraph = new Paragraph("5  No. of students appeared in practical exam					:_________________________", subFont);
			paragraph.setAlignment(Element.ALIGN_LEFT);
			document.add(paragraph);
			
			paragraph = new Paragraph("6  No. of experiments done during term			:_________________________", subFont);
			paragraph.setAlignment(Element.ALIGN_LEFT);
			document.add(paragraph);
			
			paragraph = new Paragraph("6.1  knowledge level(Study level)				:_________________________", subFont);
			paragraph.setAlignment(Element.ALIGN_LEFT);
			document.add(paragraph);
			
			paragraph = new Paragraph("6.2  Skill Level(Performence Level)			:_________________________", subFont);
			paragraph.setAlignment(Element.ALIGN_LEFT);
			document.add(paragraph);
			
			
			paragraph = new Paragraph("6.3  Literature survey(Reference Level)					:_________________________", subFont);
			paragraph.setAlignment(Element.ALIGN_LEFT);
			document.add(paragraph);
			
			paragraph = new Paragraph("6.4  If any Other Please specify			:_________________________", subFont);
			paragraph.setAlignment(Element.ALIGN_LEFT);
			document.add(paragraph);
			
			paragraph = new Paragraph("7  Availability of separate lab for the subject(Yes/No) 				:_________________________", subFont);
			paragraph.setAlignment(Element.ALIGN_LEFT);
			document.add(paragraph);
			
			paragraph = new Paragraph("8  Regular lab assistant appointed(Yes/No)			:_________________________", subFont);
			paragraph.setAlignment(Element.ALIGN_LEFT);
			addEmptyLine(paragraph, 2);
			
			document.add(paragraph);

			
			//paragraph = new Paragraph("5 No. of students appeared in practical exam					:_________________________", subFont);
			//paragraph.setAlignment(Element.ALIGN_LEFT);
			
			paragraph = new Paragraph();
			// add a table
			PdfPTable table = new PdfPTable(6);

		//t.setBorderColor(BaseColor.GRAY);
			// t.setPadding(4);
			// t.setSpacing(4);

			// t.setBorderWidth(1);

			PdfPCell c1 = new PdfPCell(new Phrase("NO. ",subcatFont));
			c1.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(c1);

			c1 = new PdfPCell(new Phrase("Rating(Put Tick as per your Observation)",subcatFont));
			c1.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(c1);

			c1 = new PdfPCell(new Phrase("Excellent",subcatFont));
			c1.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(c1);

			c1 = new PdfPCell(new Phrase("V.good",subcatFont));
			c1.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(c1);

			c1 = new PdfPCell(new Phrase("Good",subcatFont));
			c1.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(c1);

			c1 = new PdfPCell(new Phrase("Poor",subcatFont));
			c1.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(c1);

			
			
			table.setHeaderRows(1);
			
			table.addCell("1");
		    table.addCell("Laboratory Infrastructural facility:");
	
		    table.addCell("");
			table.addCell("");
			
			table.addCell("");
			
			
			table.addCell("");
			
			
			table.addCell("2");
			
			
			table.addCell("Laboratory Resources facility:");
			
			
			table.addCell("");
			table.addCell("");
			
			
			table.addCell("");
			
			
			
			table.addCell("");

			
			table.addCell("2.1");
			table.addCell("Instruments");

			table.addCell("");
			table.addCell("");
			table.addCell("");
			table.addCell("");
			

			
			table.addCell("2.2");
			table.addCell("Equipments");

			table.addCell("");
			table.addCell("");
			table.addCell("");
			table.addCell("");

			
			
			table.addCell("2.3");
			table.addCell("Trainer kits");

			table.addCell("");
			table.addCell("");
			table.addCell("");
			table.addCell("");

			
			
			
			table.addCell("3");
			table.addCell("Laboratory cleanliness:");

			table.addCell("");
			table.addCell("");
			table.addCell("");
			table.addCell("");


			
			table.addCell("4");
			table.addCell("Cooperation of Principal/Head/Internal examiner:");

			table.addCell("");
			table.addCell("");
			table.addCell("");
			table.addCell("");

			
			table.addCell("4.1");
			table.addCell("Prinicipal");

			table.addCell("");
			table.addCell("");
			table.addCell("");
			table.addCell("");

			
			
			table.addCell("4.2");
			table.addCell("Head of Department");

			table.addCell("");
			table.addCell("");
			table.addCell("");
			table.addCell("");

			
			
			table.addCell("4.3");
			table.addCell("Internal Examiner");

			table.addCell("");
			table.addCell("");
			table.addCell("");
			table.addCell("");

			
			
			table.addCell("4.4");
			table.addCell("Ovreall view for students performence:");

			table.addCell("");
			table.addCell("");
			table.addCell("");
			table.addCell("");

			
			paragraph.add(table);



			// now add all this to the document
			document.add(paragraph);
			
			
			paragraph = new Paragraph("        Any Innovative Technique/Idea Observed related to subject			:", subFont);
			paragraph.setAlignment(Element.ALIGN_LEFT);
			addEmptyLine(paragraph, 2);
			
			document.add(paragraph);

			
			paragraph = new Paragraph("Signature of External Examiner			", subFont);
			paragraph.setAlignment(Element.ALIGN_RIGHT);
			addEmptyLine(paragraph, 2);
			
			document.add(paragraph);

			
			document.close();

						response.setContentType ( "application / pdf"); 

			response.setContentLength (ba.size ()); 

			ServletOutputStream out = response.getOutputStream (); 

			ba.writeTo (out); 

			out.flush (); 
			response.setContentType ( "application / pdf"); 

			response.setContentLength (ba.size ()); 

			//ServletOutputStream out = response.getOutputStream (); 

			ba.writeTo (out); 

			out.flush (); 

		} catch (Exception e) {
			e.printStackTrace();
		}
	
		


		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

	private static void createTable(Paragraph paragraph)
			throws BadElementException {
		PdfPTable table = new PdfPTable(4);

		// t.setBorderColor(BaseColor.GRAY);
		// t.se


        // Padding(4);
		// t.setSpacing(4);

		// t.setBorderWidth(1);

		PdfPCell c1 = new PdfPCell(new Phrase("NO. "));
		c1.setHorizontalAlignment(Element.ALIGN_CENTER);
		table.addCell(c1);

		c1 = new PdfPCell(new Phrase("Rating(Put Tick as per your Observation)"));
		c1.setHorizontalAlignment(Element.ALIGN_CENTER);
		table.addCell(c1);

		c1 = new PdfPCell(new Phrase("Excellent"));
		c1.setHorizontalAlignment(Element.ALIGN_CENTER);
		table.addCell(c1);

		c1 = new PdfPCell(new Phrase("V.good"));
		c1.setHorizontalAlignment(Element.ALIGN_CENTER);
		table.addCell(c1);

		c1 = new PdfPCell(new Phrase("Good"));
		c1.setHorizontalAlignment(Element.ALIGN_CENTER);
		table.addCell(c1);

		c1 = new PdfPCell(new Phrase("Poor"));
		c1.setHorizontalAlignment(Element.ALIGN_CENTER);
		table.addCell(c1);

		table.setHeaderRows(1);
		
		
		/* * UserDao uesr = new UserDao(); List ls =user.search();
		 * 
		 * for (int i = 0; i < ls.size(); i++) { UserVO user =
		 * (UserVO)ls.get(i); table.addCell(user.getSalary()); }
		*/ 
		table.addCell("Basic Salary");
		
		 
		table.addCell("");
		
		table.addCell("1.1");
		table.addCell("Professional Tax");
		table.addCell("1.3");
		table.addCell("Total Earning");
		table.addCell("1.5");
		table.addCell("Bonus");
		table.addCell("2.1");
		table.addCell("Other Deduction");
		table.addCell("2.3");
		table.addCell("Total Deduction");
		table.addCell("2.5");
		table.addCell("");
		table.addCell("");

		table.addCell("Net Amount ");
		table.addCell("");
		paragraph.add(table);

	}

	private static void addEmptyLine(Paragraph paragraph,int number) 
	{
		for (int i = 0; i < number; i++) {
			paragraph.add(new Paragraph(" "));
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
