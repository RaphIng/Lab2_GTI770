 import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;


public class WekaIO {

	public Instances data;
	public void Read(String path) throws Exception
	{
		 DataSource source = new DataSource(path);
		 this.data = source.getDataSet();
		 // setting class attribute if the data format does not provide this information
		 // For example, the XRFF format saves the class attribute information as well
		 if (this.data.classIndex() == -1)
		   this.data.setClassIndex(this.data.numAttributes() - 1);
	}
}
