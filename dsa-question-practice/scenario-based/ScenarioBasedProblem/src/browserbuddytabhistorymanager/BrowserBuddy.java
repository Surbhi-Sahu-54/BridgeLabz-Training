package browserbuddytabhistorymanager;
import java.util.Stack;

class BrowserBuddy {
    private BrowserTab activeTab = new BrowserTab();
    private Stack<BrowserTab> closedTabs = new Stack<>();

    void openPage(String url) {
        activeTab.visit(url);
    }

    void back() {
        activeTab.back();
    }

    void forward() {
        activeTab.forward();
    }

    void closeTab() {
        closedTabs.push(activeTab);
        activeTab = new BrowserTab();
        System.out.println("Tab closed.");
    }

    void restoreTab() {
        if (!closedTabs.isEmpty()) {
            activeTab = closedTabs.pop();
            System.out.println("Restored tab. Current page: " + activeTab.getCurrentPage());
        } else {
            System.out.println("No tabs to restore!");
        }
    }
}
