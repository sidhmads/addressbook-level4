package seedu.address.model.person.exceptions;

import seedu.address.commons.exceptions.DuplicateDataException;

//@@author royceljh
/**
 * Signals that the operation will result in duplicate Event objects.
 */
public class DuplicateEventException extends DuplicateDataException {
    public DuplicateEventException() {
        super("Operation would result in duplicate events");
    }
}
