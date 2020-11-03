package application;
	
import java.util.Random;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Main extends Application {
	Random r=new Random();
	int stage=0;
	
	int aa[]=new int[5];
	int bb[]=new int[5];
	int a[]=new int[5];
	int b[]=new int[5];
	int aa6;
	int bb6;
	int kill[]=new int[6];
	int a6;
	int b6;
	int mp[]=new int[5];

	Label h[]=new Label[14];
	
	Button bt[]=new Button[5];
	String L[]=new String[10];
	Label m[] =new Label[10];
	
	String Lm[]=new String[5];
	Image image[] = new Image[5];
	int j;
	
	public void start(Stage ps) {
		try {
			
			GridPane root = new GridPane();
			Scene scene = new Scene(root,960,540);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			for (int i=0; i<kill.length; i++) {
				kill[i]=0;
			}

			for (int i=0; i<aa.length; i++) {
				aa[i]=r.nextInt(10);
			}
			aa6=r.nextInt(10)+10;

			for (int i=0; i<bb.length; i++) {
				bb[i]=r.nextInt(20);
			}
			bb6=r.nextInt(20)+20;
			for (int i=0; i<a.length; i++) {
				a[i]=aa[i];
			}
			a6=aa6;
			for (int i=0; i<b.length; i++) {
				b[i]=bb[i];
			}
			b6=bb6;
			for (int i=0; i<mp.length; i++) {
				mp[i]=r.nextInt(10);
			}
			h[0] =new Label("���ӹ��");
			h[1] =new Label("�� ������ ���谡�� ��忡�� �Ƿڸ� �޾� ���͸� ó���� �������� ��Ƽ�� �����Դϴ�.");
			h[2] =new Label("ó�� ������ ���ݷ°� ü���� 0���� 9���� 0���� 19���� �������� �������ϴ�.");
			h[3] =new Label("���谡�� ���ݷ°� ü���� 10���� 19���� 20���� 39���� �������� �������ϴ�.");
			h[4] =new Label("�Ƿڼ����� ���͸� ������ �ش��ϴ� ���Ͱ� ��� �ִ� ������ ���ϴ�.");
			h[5] =new Label("���谡�� ���͸� �����ϰ�, ���Ͱ� ���谡�� �����մϴ�.");
			h[6] =new Label("���� ü���� ���谡�� ���ݷ� ��ŭ, ���谡 ü���� ���� ���ݷ� ��ŭ �������ϴ�.");

			for (int i=0; i<7; i++) {
				root.add(h[i], 0, 1+i, 1, 1);
				}
			
			
			h[0].setId("rule");
			
			Button bt0=new Button("���� ������");
			root.add(bt0, 0, 0, 4, 1);
			
			bt0.setOnAction(new EventHandler<ActionEvent>() {

				public void handle(ActionEvent arg0) {
					GridPane root = new GridPane();
					Scene scene = new Scene(root,960,540);
					scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
					root.add(h[0], 0, 1, 4, 1);
					
					h[7] =new Label("�̷��� 1���� �������ϴ�.");
					h[8] =new Label("������ ü���� 0���ϰ� �ȴٸ� ���� �� ���� ü���� �ݸ�ŭ");
					h[9] =new Label("���谡�� ü���� ����ϰ� ���ݷ��� -4���� 5���� ���մϴ�.");
					h[10] =new Label("�׸��� ���Ͱ� ���� ��ҿ��� ���ο� ���Ͱ� �����Ǵµ� �� ������ ���ݷ°� ü����");
					h[11] =new Label("0���� (�������� ���� ������ ��+1)X10-1����, ü���� 0���� (�������� ���� ");
					h[12] =new Label("������ ��+1)X20-1���� �������� �������ϴ�.");
					h[13] =new Label("���谡 ü���� 0���ϰ� �Ǹ� ��ȥ�� ���̴� ��� ���� �� ���ӿ����� �˴ϴ�.");
					for (int i=7; i<14; i++) {
						root.add(h[i], 0, i-5, 4, 1);
						}

					Button btt=new Button("���� ����");
					root.add(btt, 0, 0, 4, 1);
					

					
					btt.setOnAction(new EventHandler<ActionEvent>() {

						public void handle(ActionEvent arg0) {
							GridPane root1 = new GridPane();
							Scene scene = new Scene(root1,423,600);
							scene.getStylesheets().add(getClass().getResource("application1.css").toExternalForm());
							Label l1 =new Label("���� ����");
							Label l2 =new Label("���� ");
							Label l3 =new Label("���ݷ�");
							Label l4 =new Label("ü��");
							l1.setId("l1");
							l2.setId("l2");
							l3.setId("l3");
							l4.setId("l4");
							root1.add(l1, 0, 0, 4, 1);
							root1.add(l2, 0, 1, 1, 1);
							root1.add(l3, 1, 1, 1, 1);
							root1.add(l4, 2, 1, 1, 1);
							
							
							for(int i=0; i<bt.length; i++) {
								bt[i]=new Button();
								root1.add(bt[i], 0, i+2, 1, 1);
								L[i*2]=Integer.toString(a[i]);
								m[i*2] =new Label(L[i*2]);
								root1.add(m[i*2], 1, i+2, 1, 1);
								L[i*2+1]=Integer.toString(b[i]);
								m[i*2+1] =new Label(L[i*2+1]);
								root1.add(m[i*2+1], 2, i+2, 1, 1);
								
							}
							
							Label atk =new Label("���谡�� ���ݷ�");
							Label hp =new Label("���谡�� ü��");
							root1.add(atk, 0, 7, 1, 1);
							root1.add(hp, 0, 8, 1, 1);
							String L61=Integer.toString(a6);
							Label m61 =new Label(L61);
							root1.add(m61, 1, 7, 1, 1);
							String L62=Integer.toString(b6);
							Label m62 =new Label(L62);
							root1.add(m62, 1, 8, 1, 1);
							Button bttt=new Button("���� ����");
							
							stage++;
							
							for ( int i=0; i<Lm.length; i++) {
								j=i;
								Lm[j]=Integer.toString(mp[j]);
								image[j] = new Image(getClass().getResourceAsStream("m"+Lm[j]+".png"));
						        bt[j].setGraphic(new ImageView(image[j]));
						        bt[j].setOnAction(new EventHandler<ActionEvent>() {
						            public void handle(ActionEvent arg0) {
										GridPane root2 = new GridPane();
										Scene scene = new Scene(root2,555,416);
										scene.getStylesheets().add(getClass().getResource("application2.css").toExternalForm());
										b[j]=b[j]-a6;
										if(b[j]>0) b6=b6-a[j];
										
										String Lb1=Integer.toString(b[j]);
										String Lb2=Integer.toString(b6);
										
										Label lb1=new Label("������ ���� ü�� : "+Lb1);
										Label lb2=new Label("������ ���谡 ü�� : "+Lb2);
										root2.add(lb1, 0, 1, 4, 1);
										root2.add(lb2, 0, 2, 4, 1);
										
										if(b[j]<=0) {
											kill[j+1]++;
											Label lb3=new Label("���Ͱ� �׾����ϴ�.");
											root2.add(lb3, 0, 3, 4, 1);
											b6=b6+bb[j]/2;
											String Lb3=Integer.toString(bb[j]/2);
											Label lb4=new Label(Lb3+"��ŭ ü���� ȸ���Ͽ����ϴ�.");
											root2.add(lb4, 0, 4, 4, 1);
											a6=a6+r.nextInt(10)-4;
											String Lb4=Integer.toString(a6);
											Label lb5=new Label("���ݷ��� "+Lb4+"�� ��ȭ�Ͽ����ϴ�.");
											root2.add(lb5, 0, 5, 4, 1);
											aa[j]=r.nextInt(10*kill[j+1]);
											bb[j]=r.nextInt(20*kill[j+1]);
											mp[j]=r.nextInt(10);
											kill[0]++;
											a[j]=aa[j];
											b[j]=bb[j];
											}
										else {
											Label lb3=new Label("���Ͱ� ��ó�� �Ծ����ϴ�.");
											root2.add(lb3, 0, 3, 4, 1);
											}
										if(b6<=0) {
											Label lb5=new Label("�������� �й��Ͽ����ϴ�.");
											root2.add(lb5, 0, 4, 4, 1);
											root2.add(bttt, 0, 5, 4, 1);
											}
										else {
											btt.setText("Ȩ����");
											root2.add(btt, 0, 0, 4, 1);
											}
										
										ps.setScene(scene);
										ps.setTitle((j+1)+"�� ���͸� ���� �� �ִ� ����");
										ps.show();
										
									}
								});
							}
							bttt.setOnAction(new EventHandler<ActionEvent>() {
								 
								public void handle(ActionEvent event) {
									GridPane root3 = new GridPane();
									Scene scene = new Scene(root3,700,537);
									scene.getStylesheets().add(getClass().getResource("application3.css").toExternalForm());
									
									Label end1=new Label("���谡�� ����߽��ϴ�.");
									root3.add(end1, 0, 0, 4, 1);
									String ed1=Integer.toString(stage);
									Label end2=new Label("�� "+ed1+"�� ������ �Ͽ� ������ ����Ǿ����ϴ�.");
									root3.add(end2, 0, 1, 4, 1);
									String ed2=Integer.toString(kill[0]);
									Label end3=new Label("�� "+ed2+"���� ���͸� �׿����ϴ�");
									root3.add(end3, 0, 2, 4, 1);
									
									ps.setScene(scene);
									ps.setTitle("���� ����� ��ȥ���� �ִ� ��� ��");
									ps.show();
								}

							});
							
							
							ps.setScene(scene);
							String stage1=Integer.toString(stage);
							ps.setTitle(stage1+"��° ��");
							ps.show();
						}
					});
					ps.setScene(scene);
					ps.setTitle("���� ��� ����");
					ps.show();
			}
			}
			
			);
			
			
			ps.setScene(scene);
			ps.setTitle("���� ��� ����");
			ps.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
			launch(args);
			
	}
}
