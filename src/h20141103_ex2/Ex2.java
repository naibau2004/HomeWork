package h20141103_ex2;

public class Ex2 
{
	public static String [] intChangeFourString ( int x )	//�m��1����k�A���Ʀr�ର4��Ʀr��
	{
		if ( x < 10 )											//��J���Ʀr���Ӧ��
		{
			String []  tempArray = new String [4] ;				//�إߤ@�Ӱ}�C�A�Ψөӱ��d�B�ʡB�Q�B�Ӧ�ƪ��Ʀr
			String num1000 = "0" ;								//�]�d��1-9�A�N�d��Ƹ�0
			String num100 = "0" ;								//�]�d��1-9�A�N�ʦ�Ƹ�0
			String num10 = "0" ;								//�]�d��1-9�A�N�Q��Ƹ�0
			String num1 = Integer.toString( x ) ;				//�Nx(1-9)�ର�r��
			
			tempArray[0] = num1000 ;							//�ϥΰ}�C�ӱ��d��Ʀr��
			tempArray[1] = num100 ;								//�ϥΰ}�C�ӱ��ʦ�Ʀr��							
			tempArray[2] = num10 ;								//�ϥΰ}�C�ӱ����Ʀr��
			tempArray[3] = num1 ;								//�ϥΰ}�C�ӱ��Ӧ�Ʀr��
			
			return tempArray ;									//�^�ǭӦ�ƪ��}�C
					
		}else if ( (x >= 10) && (x <100) )						//��J���Ʀr���Q���
		{
			String []  tempArray = new String [4] ;
			
			String tempX = Integer.toString( x ) ;				//�Nx(10-99)�ର�r��
			String num1000 = "0" ;								//�]�d��10-99�A�N�d��Ƹ�0
			String num100 = "0" ;								//�]�d��10-99�A�N�ʦ�Ƹ�0
			String num10 = tempX.substring(0,1) ;				//�o��ϥ�java�r�ꤺ�ت���k(substing)�A�ΨӨ��X�Q��ƪ��r��
			String num1 = tempX.substring(1,2) ;				//�o��ϥ�java�r�ꤺ�ت���k(substing)�A�ΨӨ��X�Ӧ�ƪ��r��
			
			tempArray[0] = num1000 ;							//�ϥΰ}�C�ӱ��d��Ʀr��
			tempArray[1] = num100 ;								//�ϥΰ}�C�ӱ��ʦ�Ʀr��							
			tempArray[2] = num10 ;								//�ϥΰ}�C�ӱ����Ʀr��
			tempArray[3] = num1 ;								//�ϥΰ}�C�ӱ��Ӧ�Ʀr��
			
			return tempArray ;									//�^�ǤQ��ƪ��}�C
			
		}else if ( (x >= 100) && (x < 1000) )					//��J���Ʀr���ʦ��
		{
			String []  tempArray = new String [4] ;				//�إߤ@�Ӱ}�C�A�Ψөӱ��d�B�ʡB�Q�B�Ӧ�ƪ��Ʀr
			
			String tempX = Integer.toString( x ) ;				//�Nx(100-999)�ର�r��	
			String num1000 = "0" ;								//�]�d��100-999�A�N�d��Ƹ�0
			String num100 = tempX.substring(0,1) ;				//�o��ϥ�java�r�ꤺ�ت���k(substing)�A�ΨӨ��X�ʦ�ƪ��r��
			String num10 = tempX.substring(1,2) ;				//�o��ϥ�java�r�ꤺ�ت���k(substing)�A�ΨӨ��X�Q��ƪ��r��
			String num1 = tempX.substring(2,3) ;				//�o��ϥ�java�r�ꤺ�ت���k(substing)�A�ΨӨ��X�Ӧ�ƪ��r��
			
			tempArray[0] = num1000 ;							//�ϥΰ}�C�ӱ��d��Ʀr��
			tempArray[1] = num100 ;								//�ϥΰ}�C�ӱ��ʦ�Ʀr��							
			tempArray[2] = num10 ;								//�ϥΰ}�C�ӱ����Ʀr��
			tempArray[3] = num1 ;								//�ϥΰ}�C�ӱ��Ӧ�Ʀr��
			
			return tempArray ;									//�^�Ǧʦ�ƪ��}�C
			
		}else if ( (x >= 1000) && ( x < 10000) )				//��J���Ʀr���d���		
		{
			String []  tempArray = new String [4] ;				//�إߤ@�Ӱ}�C�A�Ψөӱ��d�B�ʡB�Q�B�Ӧ�ƪ��Ʀr
			
			String tempX = Integer.toString( x ) ;				//�Nx(1000-9999)�ର�r��		
			String num1000 = tempX.substring(0,1) ;				//�o��ϥ�java�r�ꤺ�ت���k(substing)�A�ΨӨ��X�d��ƪ��r��
			String num100 = tempX.substring(1,2) ;				//�o��ϥ�java�r�ꤺ�ت���k(substing)�A�ΨӨ��X�ʦ�ƪ��r��
			String num10 = tempX.substring(2,3) ;				//�o��ϥ�java�r�ꤺ�ت���k(substing)�A�ΨӨ��X�Q��ƪ��r��
			String num1 = tempX.substring(3,4) ;				//�o��ϥ�java�r�ꤺ�ت���k(substing)�A�ΨӨ��X�Ӧ�ƪ��r��
			
			tempArray[0] = num1000 ;							//�ϥΰ}�C�ӱ��d��Ʀr��
			tempArray[1] = num100 ;								//�ϥΰ}�C�ӱ��ʦ�Ʀr��							
			tempArray[2] = num10 ;								//�ϥΰ}�C�ӱ����Ʀr��
			tempArray[3] = num1 ;								//�ϥΰ}�C�ӱ��Ӧ�Ʀr��
			
			return tempArray ;									//�^�Ǥd��ƪ��}�C
			
		}else
		{
			return null ;										//�����ŦX�N�^��null�A���Ҥ��|�������p
		}
	}
	
	public static String[] getArray ()							//�m��1����k�A����k�|�^�ǥ|��ƨ��ۦP�Ʀr���}�C
	{
		int counter = 0 ;										//�إߤ@�ӭp�ƾ��A�ΨӰO���@���X�ӼƦr�|�ŦX�D�ر���
		String [] arrayAll = new String [9999] ;				//�إߤ@�ӼȦs�ΰ}�C�A�j�p���D�ش��Ѥ��j�p  
		
		for ( int x = 1 ; x < 10000 ; x++ )						//���D�D�ؽd��1-9999�إ߰j��
		{
			String [] temp = intChangeFourString(x) ;			//�Nx�ȵ���intChangeForString��k�A�������ͥ|��ƪ��}�C
			
			String num1000 = temp[0] ;							//�N���ͪ��}�C[0](�d���)�A�����ܼ�a
			String num100 = temp[1] ;							//�N���ͪ��}�C[1](�ʦ��)�A�����ܼ�b
			String num10 = temp[2] ;							//�N���ͪ��}�C[2](�Q���)�A�����ܼ�c
			String num1 = temp[3] ;								//�N���ͪ��}�C[3](�Ӧ��)�A�����ܼ�d
			
			//�N�Ҧ��ƦC�զX�i��P�_
			if ( num1000.equals(num100) || num1000.equals(num10) || num1000.equals(num1) || num100.equals(num10) || num100.equals(num1) || num10.equals(num1) )
			{
				arrayAll[x-1] = num1000 + num100 + num10 + num1  ;	//�}�C�_�l�Ȭ�0�A��x�_�l�Ȭ�1�A�Gx-1�A��a+b+c+d = [1-9]+[0-9]+[0-9]+[0-9]
				counter = counter + 1 ;								//�C�ŦX�@���Ʀr�A�h�p�ƾ��N�[1	
			}	
		}
		
		String [] arrayFilter = new String [counter] ;			//�إߤ@�ӳ̲׭n���o���}�C(arrayFilter)�A�}�C�j�p�����e�p�ƾ����֥[�j�p
		int counter2 = 0 ;										//�إߤ@�ӷǳƲ֥[���ܼ�
		
		for ( String item : arrayAll )							//�N���e9999�j�p���}�C���e���X
		{
			if ( ! ( item == null ) )							//�P�_���X�����e�O�_�t��(�ŦX�n�D)
			{
				arrayFilter[counter2] = item ;					//�N�Ȫ����e��J�s�}�C
				counter2 = counter2 + 1 ;						//�C�W�[�@�ӭȡA�}�C���ޭȭn�[1
			}
		}
		
		return arrayFilter ;									//�N�̲׵��G�^��
	}

	public static String[] newArray ()								//�m��1����k�A����k�|�^��getArray()���ͪ��}�C���ҨS�����Ʀr
	{
		String [] tempArray = new String[10000] ;					//�إߤ@��9999+1���}�C�A�ΨӶ�J1-9999���ơAtempArray[0]��Null
		String [] oldArray = getArray() ;							//�N�m��1����k���X�A�ǳư��p��
		String [] newArray = new String [9999-oldArray.length] ;	//�إߤ@�Ӱ}�C�A�ΨӦs��oldArray���A1-9999�ҨS�����ơA���׬�9999-��}�C������
		int counter = 0 ;											//�إߤ@�ӭp�ƾ��A�Ψӭp��newArray���}�C�j�p
		
		for ( String item : oldArray )								//�N�m��1���}�C�v�@���X
		{
			int intItem = Integer.parseInt(item) ;					//�N���X�����ର�Ʀr�A0001 = 1 ; 0099 = 99 ...
			tempArray[intItem] = item ;								//��tempArray[1] = 1 ; tempArray[100] = 100 ...tempArray[9999] = 9999
		}
		
		for ( int x = 1 ; x < 10000 ; x++ )							//�]���S��temp[0]=0 ; �G�j��q1�}�l
		{
			if ( tempArray[x] == null )								//�Y���e��tempArray[x]��Null���ܡA���x���s�b��m��1���}�C���A���x�S������ӬۦP����
			{
				String [] temp = intChangeFourString (x) ;			//�NX���ର�|��ƪ��r��
				String num1000 = temp[0] ;							//�N���ͪ��}�C[0](�d���)�A�����ܼ�a
				String num100  = temp[1] ;							//�N���ͪ��}�C[1](�ʦ��)�A�����ܼ�b
				String num10   = temp[2] ;							//�N���ͪ��}�C[2](�Q���)�A�����ܼ�c
				String num1    = temp[3] ;								//�N���ͪ��}�C[3](�Ӧ��)�A�����ܼ�d
				newArray[counter] = num1000 + num100 + num10 + num1 ;	//counter��0�}�l�A��J�|��ƪ��r��
				counter = counter + 1 ;								//counter�C��J�@�ӥ|��ƪ��r��A�hcounter+1
			}
		}
		return newArray ;											//�̲׷|�o��m��1�}�C�ҨS�����ƪ��}�C�A�N���}�C�^��
	}
				
	public static void main ( String [] args )						//�ǳƦn�T�Ӥ�k�A�}�l�������ͽm��2���ѵ�
	{

		if ( ! (args.length == 3) ) 								//man( String[]args )�Ψӱ����ϥΪ̿�J���ѼơA�����P�_�ϥΪ̬O�_��J�T�ӰѼ�
		{
			System.out.println ( "�п�J�T�ӰѼ�" ) ;				//�Y�S����J�T�ӰѼơA�h���ʹ��ܰT��
			System.exit(0) ;										//�]�S���̳W�w����A�ҥH���}�{��
			 
		}else if ( ! (args[0].length() == 4) )						//�ˬd�Ĥ@�ӰѼƬO�_��4�Ӧr��
		{
			System.out.println ( "�Ĥ@�ӰѼƽп�J�|���" ) ;		//�Y�D4�Ӧr���h���ʹ��ܰT��
			System.exit(0) ;										//�]�S���̳W�w����A�ҥH���}�{��
		}
		
		try	 //�]�ϥΪ̿�J���ѼƦ��i��D��ƩΦr��A�G�o��]�w�@��try-catch�Ӱ��ˬd
		{
			//�|�ձN�ϥΪ̤��Ĥ@�ӰѼ��ର�Ʀr
			intChangeFourString ( Integer.parseInt(args[0]) ) ;
			
			//�|�ձN�ϥΪ̤��Ĥ@�βĤT�ӰѼ��ର�Ʀr
			Integer.parseInt( args[1] ) ;
			Integer.parseInt( args[2] ) ;
			
		}catch ( Exception e)
		{
			//���ѫh���Ϳ��~�T���ðh�X�{��
			System.out.println ( "�Ĥ@��Ѽƽп�J4���ơA�ĤG�βĤT��Ѽƽп�J1����" ) ;
			System.exit(0) ;
		}
		
			//�N�Ϫ̿�J���Ĥ@�Ѽ��ର�Ʀr�ᵹ�����e�]�w����k�ର�|�Ӧr�ꪺ�}�C
			String [] argNum1 = intChangeFourString ( Integer.parseInt(args[0]) ) ;
			String num1000 = argNum1[0] ;			//���U�Ӫ� num1000 �N��Ĥ@�ӰѼƪ��d��Ʀr��
			String num100  = argNum1[1] ;			//���U�Ӫ� num100 �N��Ĥ@�ӰѼƪ��ʦ�Ʀr��
			String num10   = argNum1[2] ;			//���U�Ӫ� num10 �N��Ĥ@�ӰѼƪ��Q��Ʀr��
			String num1    = argNum1[3] ;			//���U�Ӫ� num1 �N��Ĥ@�ӰѼƪ��Ӧ�Ʀr��
		
			//�}�l���ۤ���A�Y�䤤�����ۦP�h���ʹ��ܰT�������}�{��
		if ( num1000.equals(num100) || num1000.equals(num10) || num1000.equals(num1) || num100.equals(num10) || num100.equals(num1) || num10.equals(num1) )
		{
			System.out.println ( "�Ĥ@��ѼƤ��|�ӼƦr���঳�ۦP��" ) ;
			System.exit(0) ;
		}
			
			//�ˬd�ĤG��ѼƤβĤT��ѼƬO�_���ӼơA�ӫD�Q��ƥH�W�ά��t�ơA�Y���ŦX�Ӽƫh���ͰT�������}�{��
		if ( ! (args[1].length() == 1) || ! (args[2].length() == 1 ) )
		{
			System.out.println ( "�ĤG�βĤT�Ѽƽп�J1�쥿���" ) ;
			System.exit(0) ;
		}
		
		//�N�ĤG�βĤT�Ѽ��ର�Ʀr��ۥ[
		int argNum2 = Integer.parseInt( args[1] ) ;
		int argNum3 = Integer.parseInt( args[2] ) ;
		int total = argNum2 + argNum3 ; 
		
		//�Y�ĤG�βĤT�ѼƬۥ[�Y�W�L�|�h���ͰT�������}�{��
		if ( ! (total <=4) )
		{
			System.out.println ( "�ĤG�βĤT�ѼƬۥ[���ݤp��ε���4" ) ;
			System.exit(0) ;
		}
		
		//�إߤ@�Ӱ}�C�A�N���e���ͨ�⤣�o���ƪ��}�C��k�N�J
		String [] sampleArray = newArray() ;

		//�N�s�}�C�v�@Ū�X
		for ( String arrayNum : sampleArray )
		{
			//�N�s�}�C���ȩ�Ѧ��|�Ӧr��A�ǳƻP�ϥΪ̪��Ĥ@�Ѽƶi����
			String sampleNum1 = arrayNum.substring(0,1) ;
			String sampleNum2 = arrayNum.substring(1,2) ;
			String sampleNum3 = arrayNum.substring(2,3) ;
			String sampleNum4 = arrayNum.substring(3,4) ;
			int counterA = 0 ;								//�إߤ@�ӭp�ƾ��A�Ψӭp���m�έȧ��ۦP���ӼƦ@�X��
			int counterB = 0 ;								//�إߤ@�ӭp�ƾ��A�ΨӭȬۦP����m���P���ӼƦ@�X��
			
			if ( num1000.equals(sampleNum1) )				//�w���m�έȧ��ۦP���Ӽư����(�d���)
				counterA = counterA + 1 ;					//�ŦX�h�p�ƾ�A�[1

			if ( num100.equals(sampleNum2) )				//�w���m�έȧ��ۦP���Ӽư����(�ʦ��)
				counterA = counterA + 1 ;					//�ŦX�h�p�ƾ�A�[1

			if ( num10.equals(sampleNum3) )					//�w���m�έȧ��ۦP���Ӽư����(�Q���)
				counterA = counterA + 1 ;					//�ŦX�h�p�ƾ�A�[1
			
			if ( num1.equals(sampleNum4) )					//�w���m�έȧ��ۦP���Ӽư����(�Ӧ��)
				counterA = counterA + 1 ;					//�ŦX�h�p�ƾ�A�[1
				
			if ( ! (num1000.equals(sampleNum1)) )			//���T�w���ŦX�e����m�έȧ��ۦP���W�h
			{
				//�Y�ȬۦP����m���P�A�h�p�ƾ�B�[1
				if ( num1000.equals(sampleNum2) || num1000.equals(sampleNum3) || num1000.equals(sampleNum4) )
				{
					counterB = counterB + 1 ;
				}	
			}
			
			if ( ! (num100.equals(sampleNum2)) )			//���T�w���ŦX�e����m�έȧ��ۦP���W�h	
			{
				//�Y�ȬۦP����m���P�A�h�p�ƾ�B�[1
				if ( num100.equals(sampleNum1) || num100.equals(sampleNum3) || num100.equals(sampleNum4) )
				{
					counterB = counterB + 1 ;
				}
			}
			
			if ( ! (num10.equals(sampleNum3)) )			//���T�w���ŦX�e����m�έȧ��ۦP���W�h	
			{
				//�Y�ȬۦP����m���P�A�h�p�ƾ�B�[1
				if ( num10.equals(sampleNum1) || num10.equals(sampleNum2) || num10.equals(sampleNum4) )
				{
					counterB = counterB + 1 ;
				}
			}
			
			if ( ! (num1.equals(sampleNum4)) )			//���T�w���ŦX�e����m�έȧ��ۦP���W�h
			{
				//�Y�ȬۦP����m���P�A�h�p�ƾ�B�[1
				if ( num1.equals(sampleNum1) || num1.equals(sampleNum2) || num1.equals(sampleNum3) )
				{
					counterB = counterB + 1 ;
				}
			}
			
			//�ŦX�t��覡1�ܤ֭n�W�L�ѼƭȡA�B�ŦX�t��覡2�]�ܤ֭n�W�L�Ѽƭ�
			if ( (counterA >= argNum2) && (counterB >= argNum3) )
			{
				//�N�ŦX�����G�C�L�X��
				System.out.println ( arrayNum ) ;
			}	
		}
	}
}