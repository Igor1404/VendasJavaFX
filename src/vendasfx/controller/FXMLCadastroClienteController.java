/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendasfx.controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author igor
 */
public class FXMLCadastroClienteController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private TableView<Cliente> tableViewClientes;
    @FXML
    private TableColumn<Cliente, String> tableColumnClienteNome;
    @FXML
    private TableColumn<Cliente, String> tableColumnClienteTel;
    @FXML
    private Button btnInserir;
    @FXML
    private Button btnAlterar;
    @FXML
    private Button btnRemover;
    @FXML
    private Label LabelClienteCod;
    @FXML
    private Label LabelClienteNome;
    @FXML
    private Label LabelClienteCPF;
    @FXML
    private Label LabelClienteTel;
    
    private List<Cliente> listaCliente;
    private ObservableList<Cliente> observaCliente;
    
    
    private final DataBase database = DataBaseFactory.getDataBase("postgresql")/*Mysql*/;
    private final Connection conexao = database.conectar();
    private final ClienteDao clientedao = new ClienteDao();
    
            
    
    
    
    
    
    @Override
    
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
