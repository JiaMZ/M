package cn.mm;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;


public class Genti extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/plain;charset=utf-8");
		String question_id = request.getParameter("id");
		System.out.println("id:" + question_id);
		
		try {
			////////////
			// do something
			////////////
			DBConnection db = new DBConnection();
			ResultSet rs = db.executeQuery("select * from question;");
			
			String id = "";
			String name = "";
			String optA = "";
			String optB = "";
			String optC = "";
			String optD = "";
			String answer = "";
			
			int count = 0;
			ArrayList<Question> list = new ArrayList<Question>();
			while(rs.next()){
				count++;
				id=rs.getString(1);
				name=rs.getString(2);
				optA=rs.getString(3);
				optB=rs.getString(4);
				optC=rs.getString(5);
				optD=rs.getString(6);
				answer=rs.getString(7);
				Question q = new Question(id,name,optA,optB,optC,optD,answer);
				list.add(q);
			}
			db.close();
			
			response.setCharacterEncoding("utf-8");
			PrintWriter out = response.getWriter();
			JSONObject obj = new JSONObject();
			
			Random r = new Random();
			int j=0;
			int[] ques= {-1,-1,-1,-1};
			while(j<4) {
				int randnumber = r.nextInt(10);
				
				//if not exist 	
				int k=0;
				while(k<4){
					if(randnumber==ques[k])
						break;
					k++;
				}
				if(k==4)
				{
					ques[j]=randnumber;
					System.out.println(randnumber);
					j++;
				}
			}

			
			JSONObject obj1 = new JSONObject();
			Question q1 = list.get(ques[0]);
			//obj.put("result", "ok");
			obj1.put("id", q1.id);
			obj1.put("name", q1.name);
			obj1.put("optA", q1.optA);
			obj1.put("optB", q1.optB);
			obj1.put("optC", q1.optC);
			obj1.put("optD", q1.optD);
			obj1.put("answer", q1.answer);
			obj.put("question1", obj1);
			
			JSONObject obj2 = new JSONObject();
			Question q2 = list.get(ques[1]);
			//obj.put("result", "ok");
			obj2.put("id", q2.id);
			obj2.put("name", q2.name);
			obj2.put("optA", q2.optA);
			obj2.put("optB", q2.optB);
			obj2.put("optC", q2.optC);
			obj2.put("optD", q2.optD);
			obj2.put("answer", q2.answer);
			obj.put("question2", obj2);
			
			JSONObject obj3 = new JSONObject();
			Question q3 = list.get(ques[2]);
			//obj.put("result", "ok");
			obj3.put("id", q3.id);
			obj3.put("name", q3.name);
			obj3.put("optA", q3.optA);
			obj3.put("optB", q3.optB);
			obj3.put("optC", q3.optC);
			obj3.put("optD", q3.optD);
			obj3.put("answer", q3.answer);
			obj.put("question3", obj3);
			
			JSONObject obj4 = new JSONObject();
			Question q4 = list.get(ques[3]);
			//obj.put("result", "ok");
			obj4.put("id", q4.id);
			obj4.put("name", q4.name);
			obj4.put("optA", q4.optA);
			obj4.put("optB", q4.optB);
			obj4.put("optC", q4.optC);
			obj4.put("optD", q4.optD);
			obj4.put("answer", q4.answer);
			obj.put("question4", obj4);
			
			System.out.println(obj.toString());
			out.print(obj.toString());
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void doSearch() {
		try {
			////////////
			// do something
			////////////
			DBConnection db = new DBConnection();
			ResultSet rs = db.executeQuery("select * from question;");
			
			String id = "";
			String name = "";
			String optA = "";
			String optB = "";
			String optC = "";
			String optD = "";
			String answer = "";
			
			int count = 0;
			ArrayList<Question> list = new ArrayList<Question>();
			while(rs.next()){
				count++;
				id=rs.getString(1);
				name=rs.getString(2);
				optA=rs.getString(3);
				optB=rs.getString(4);
				optC=rs.getString(5);
				optD=rs.getString(6);
				answer=rs.getString(7);
				Question q = new Question(id,name,optA,optB,optC,optD,answer);
				list.add(q);
			}
			db.close();
			
			//response.setCharacterEncoding("utf-8");
			//PrintWriter out = response.getWriter();
			JSONObject obj = new JSONObject();
			
			Random r = new Random();
			int j=0;
			int[] ques= {-1,-1,-1,-1};
			while(j<4) {
				int randnumber = r.nextInt(10);
				
				//if not exist 	
				int k=0;
				while(k<4){
					if(randnumber==ques[k])
						break;
					k++;
				}
				if(k==4)
				{
					ques[j]=randnumber;
					System.out.println(randnumber);
					j++;
				}
			}

			
			JSONObject obj1 = new JSONObject();
			Question q1 = list.get(ques[0]);
			//obj.put("result", "ok");
			obj1.put("id", q1.id);
			obj1.put("name", q1.name);
			obj1.put("optA", q1.optA);
			obj1.put("optB", q1.optB);
			obj1.put("optC", q1.optC);
			obj1.put("optD", q1.optD);
			obj1.put("answer", q1.answer);
			obj.put("question1", obj1);
			
			JSONObject obj2 = new JSONObject();
			Question q2 = list.get(ques[1]);
			//obj.put("result", "ok");
			obj2.put("id", q2.id);
			obj2.put("name", q2.name);
			obj2.put("optA", q2.optA);
			obj2.put("optB", q2.optB);
			obj2.put("optC", q2.optC);
			obj2.put("optD", q2.optD);
			obj2.put("answer", q2.answer);
			obj.put("quesiton2", obj2);
			
			JSONObject obj3 = new JSONObject();
			Question q3 = list.get(ques[2]);
			//obj.put("result", "ok");
			obj3.put("id", q3.id);
			obj3.put("name", q3.name);
			obj3.put("optA", q3.optA);
			obj3.put("optB", q3.optB);
			obj3.put("optC", q3.optC);
			obj3.put("optD", q3.optD);
			obj3.put("answer", q3.answer);
			obj.put("question3", obj3);
			
			JSONObject obj4 = new JSONObject();
			Question q4 = list.get(ques[3]);
			//obj.put("result", "ok");
			obj4.put("id", q4.id);
			obj4.put("name", q4.name);
			obj4.put("optA", q4.optA);
			obj4.put("optB", q4.optB);
			obj4.put("optC", q4.optC);
			obj4.put("optD", q4.optD);
			obj4.put("answer", q4.answer);
			obj.put("question4", obj4);
			
			System.out.println(obj.toString());
			//out.print(obj.toString());
			//out.flush();
			//out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		doSearch();
		
	}

}
