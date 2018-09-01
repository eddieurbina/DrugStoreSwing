
package drugstore;

import javax.swing.table.DefaultTableModel;

public class Load {
    public DefaultTableModel loadDrugstoreProducts(){
        DefaultTableModel model = new DefaultTableModel(){
            @Override
                public Class getColumnClass(int column) {
                    switch (column) {
                        case 0: 
                            return String.class;
                        case 1: 
                            return String.class;
                        case 2: 
                            return String.class;
                        default:
                            return String.class; 
                        
                    }
                }
        };
        String[] columnNames = {"Nombre", "Precio", "Genérico"}; 
        Object[][] data = {
            {"panadol", "0.5", true},
        {"dolofan", "0.8", false},
        {"bismutol", "1.2", true},
        {"Mejoral","1.50", false},
        {"Fortex", "2.5", true},
        {"Antalgina", "0.7", false},
        {"Calcibon", "5.00", false} 
        };
        model.setDataVector(data, columnNames);
        
        return model; 
    }
    
    public String[] cargaNombreCol() {
        String[] col = {"Nombre", "Precio", "Cantidad", "Total"}; 
        
        return col;
    }
}
