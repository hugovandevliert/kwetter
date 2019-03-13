package nl.fontys.kwetter.services.interfaces;

import nl.fontys.kwetter.exceptions.ModelNotFoundException;
import nl.fontys.kwetter.exceptions.ModelValidationException;
import nl.fontys.kwetter.models.Kweet;
import nl.fontys.kwetter.models.User;

import java.util.List;

/**
 * The interface Kweet service.
 */
public interface IKweetService {
    /**
     * Retrieve the timeline for the given user.
     *
     * @param user the user
     *
     * @return the list
     */
    List<Kweet> timeLine(User user);

    /**
     * Find kweet.
     *
     * @param id the id
     *
     * @return the kweet
     *
     * @throws ModelNotFoundException if there is no kweet with the given id
     */
    Kweet find(Integer id) throws ModelNotFoundException;

    /**
     * Find Kweets by the given text.
     *
     * @param text the text
     *
     * @return the list
     */
    List<Kweet> findByText(String text);

    /**
     * Save the given Kweet.
     *
     * @param kweet the kweet
     *
     * @return the kweet
     *
     * @throws ModelValidationException if the given model is not valid
     */
    Kweet save(Kweet kweet) throws ModelValidationException;

    /**
     * Delete the given Kweet.
     *
     * @param id the id
     *
     * @throws ModelNotFoundException if there is no kweet with the given id
     */
    void delete(Integer id) throws ModelNotFoundException;
}
