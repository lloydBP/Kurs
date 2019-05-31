package controller;

import com.sun.org.apache.bcel.internal.generic.DMUL;
import domain.District;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.DistrictModel;

import java.io.IOException;

public class MainController {

    @FXML
    private AnchorPane mainWindow;

    private ObservableList<District> districts = FXCollections.observableArrayList();

    @FXML
    private TableView<District> tbView;

    @FXML
    private TableColumn<District, Integer> idColumn;

    @FXML
    private TableColumn<District, String> districtColumn;

    @FXML
    private TableColumn<District, String> streetColumn;

    @FXML
    private TableColumn<District, String> numberColumn;

    @FXML
    private TableColumn<District, String> flatColumn;

    @FXML
    private TableColumn<District, String> memberColumn;

    @FXML
    private TextField idText;

    @FXML
    private TextField dText;

    @FXML
    private TextField sText;

    @FXML
    private TextField numText;

    @FXML
    private TextField flatText;

    @FXML
    private TextField memberText;

//    @FXML
//    private MenuItem addFlat;
//
//    @FXML
//    private MenuItem editFlat;
//
//    @FXML
//    private MenuItem searchFlat;
//
//    @FXML
//    private MenuItem deleteFlat;

    // инициализируем форму данными
    @FXML
    private void initialize() {
        initData();

//        idColumn.setCellValueFactory(new PropertyValueFactory<District, Integer>("id"));
//        districtColumn.setCellValueFactory(new PropertyValueFactory<District, String>("district"));
//        streetColumn.setCellValueFactory(new PropertyValueFactory<District, String>("street"));
//        numberColumn.setCellValueFactory(new PropertyValueFactory<District, String>("number"));
//        flatColumn.setCellValueFactory(new PropertyValueFactory<District, String>("flat"));
//        memberColumn.setCellValueFactory(new PropertyValueFactory<District, String>("member"));

        districts = FXCollections.observableArrayList(DistrictModel.getContacts());


        tbView.setItems(districts);
    }

    // подготавливаем данные для таблицы
    // вы можете получать их с базы данных
    private void initData() {
        districts.add(new District(1, "Шевченківський", "Лук'янівська", "21Б", "15", "Проданов"));
        districts.add(new District(2, "Шевченківський", "Лук'янівська", "21Б", "228", "Проданов"));

    }

    public void addFlat() throws IOException {
        Stage addNewFlat = new Stage();
        addNewFlat.setTitle("Додавання Будинку");
        addNewFlat.setResizable(false);
        addNewFlat.setScene(new Scene(FXMLLoader.load(
                getClass().getResource("/javafx/modal/add.fxml")
        )));
        addNewFlat.initOwner(mainWindow.getScene().getWindow());
        addNewFlat.initModality(Modality.WINDOW_MODAL);
        addNewFlat.setOnCloseRequest(event -> {
            districts.setAll(DistrictModel.getContacts());
            tbView.refresh();
        });
        addNewFlat.showAndWait();
    }
    public void editFlat() {
    }
    public void searchFlat() {
    }
    public void deleteFlat() {
    }

    public void mouseInfo(MouseEvent mouseEvent) {
        District district = tbView.getSelectionModel().getSelectedItem();
        idText.setText(String.valueOf(district.getId()));
        dText.setText(district.getDistrict());
        sText.setText(district.getStreet());
        numText.setText(district.getNumber());
        flatText.setText(district.getFlat());
        memberText.setText(district.getMember());
    }



}
