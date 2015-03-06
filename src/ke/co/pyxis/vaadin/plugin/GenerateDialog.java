package ke.co.pyxis.vaadin.plugin;

/**
 * Created by achachiez on 06/03/15.
 */
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.psi.PsiClass;
import org.jetbrains.annotations.Nullable;
import javax.swing.*;

public class GenerateDialog extends DialogWrapper {
   JPanel mainPanel;

    public JTextField getRepos() {
        return repos;
    }

    public void setRepos(JTextField repos) {
        this.repos = repos;
    }

    JTextField repos;
    protected GenerateDialog(PsiClass psiClass) {
        super(psiClass.getProject());
        setTitle("Fill The Packages to place code");
        mainPanel = new JPanel();
        repos = new JTextField(40);
        TextPrompt textPrompt = new TextPrompt("Enter Models Package", repos);
        mainPanel.add(repos);
        mainPanel.setVisible(true);
        init();
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        return mainPanel;
    }


}
