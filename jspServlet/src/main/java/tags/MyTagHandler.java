package tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyTagHandler extends TagSupport 
{

	@Override
	public int doStartTag() throws JspException {
		try {
			JspWriter out=pageContext.getOut();
			out.print("<h1> hello coustm tag</h1>");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return SKIP_BODY;
	}
	
	
	
	

}
