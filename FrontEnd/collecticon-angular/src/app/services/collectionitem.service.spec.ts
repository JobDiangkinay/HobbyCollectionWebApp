import { TestBed } from '@angular/core/testing';

import { CollectionitemService } from './collectionitem.service';

describe('CollectionitemService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: CollectionitemService = TestBed.get(CollectionitemService);
    expect(service).toBeTruthy();
  });
});
