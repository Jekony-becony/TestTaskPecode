package models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CatalogMenu {
    PLUMBING_AND_REPAIR(6);

    private final int id;
}