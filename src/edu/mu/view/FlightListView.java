package edu.mu.view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

import edu.mu.model.FlightInformation;

public class FlightListView extends JFrame {

	private JPanel contentPanel;
	private JTable flightTable;
    private JButton sortButton;
    private DefaultTableModel model;

	
	public FlightListView() {
		setTitle("Flight List View");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		
		contentPanel = new JPanel();
		setContentPane(contentPanel);
		getContentPane().setLayout(null);
		
		// Create table model for flights
		model = new DefaultTableModel();
        flightTable = new JTable(model);

        // Add columns to the table model
        model.addColumn("Flight Number");
        model.addColumn("Departure");
        model.addColumn("Arrival");
        model.addColumn("Select Flight");
     
        sortButton = new JButton("Sort Flights");
        
        // Add components to the frame
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(new JScrollPane(flightTable), BorderLayout.CENTER);
        getContentPane().add(sortButton, BorderLayout.SOUTH);
	}
	
//	public void setRadioButtons() {
//		TableColumn radioButtonColumn = flightTable.getColumnModel().getColumn(3);
//		radioButtonColumn.setCellRenderer(new RadioButtonRenderer());
//		radioButtonColumn.setCellEditor(new RadioButtonEditor(new JCheckBox()));
//	}
//	
	public void addFlightInformationToView(FlightInformation flight) {
		model.addRow(new Object[] {flight.getFlightNumber(), flight.getDepartureLocation(), flight.getArrivalLocation(), false});
	}
	
	public void addActionListenerToSortButton(ActionListener listener) {
		sortButton.addActionListener(listener);
	}
	
//	class RadioButtonRenderer extends JRadioButton implements TableCellRenderer {
//
//		@Override
//		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
//				int row, int column) {
//			setHorizontalAlignment(CENTER);
//			setSelected(value != null && ((Boolean)value));
//			return this;
//		}
//	}
//	
//	class RadioButtonEditor extends DefaultCellEditor implements ItemListener  {
//
//        private JRadioButton button;
//
//		public RadioButtonEditor(JCheckBox checkBox) {
//			super(checkBox);
//			button =  new JRadioButton();
//			button.setHorizontalAlignment(SwingUtilities.CENTER);
//			button.addItemListener(this);
//		}
//
//		@Override
//		public void itemStateChanged(ItemEvent e) {
//			super.fireEditingStopped();
//		}
//		
//	}
	
}
