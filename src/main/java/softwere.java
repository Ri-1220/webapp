import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class softwere
 */
@WebServlet("/softwere")
public class softwere extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public softwere() {
		super();
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

		RequestDispatcher dispatcher = request.getRequestDispatcher("/softwere.jsp");
		dispatcher.forward(request, response);
		request.setAttribute("Msg2", "　　");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

		String name = request.getParameter("one");

		String hantei = request.getParameter("judge");
		int i = 0;
		try {
			i = Integer.parseInt(name);
		} catch (NumberFormatException e) {
			i = 0;
		}
		
		Random random = new Random();
		int ans = random.nextInt(100);
		int count = 0;

		

		if (hantei.equals("判定")) {

			if (i < ans) {
				if (ans - i <= 10)
					request.setAttribute("Msg2", "大吉");
				else if (ans - i <= 25)
					request.setAttribute("Msg2", "中吉");
				else if (ans - i <= 50)
					request.setAttribute("Msg2", "小吉");
				else if (ans - i <= 75)
					request.setAttribute("Msg2", "凶");
				else
					request.setAttribute("Msg2", "大凶");
			} else if (i > ans) {
				if (i - ans <= 10)
					request.setAttribute("Msg2", "大吉");
				else if (i - ans <= 25)
					request.setAttribute("Msg2", "中吉");
				else if (i - ans <= 50)
					request.setAttribute("Msg2", "小吉");
				else if (i - ans <= 75)
					request.setAttribute("Msg2", "凶");
				else
					request.setAttribute("Msg2", "大凶");
			} else if (i == ans) {
				request.setAttribute("Msg2", "正解です。 大大吉！");
			}

		}

		

		RequestDispatcher dispatcher = request.getRequestDispatcher("/softwere.jsp");
		dispatcher.forward(request, response);

	}

}
