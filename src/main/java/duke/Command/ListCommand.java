package duke.Command;

import duke.DukeException;
import duke.Storage;
import duke.TaskList;
import duke.Ui;

public class ListCommand extends Command {
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        try {
            tasks.printTasks();
        } catch (DukeException e) {
            ui.showNoTasks();
        }
    }
}
